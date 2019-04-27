package parser;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

import files.FileReader;
import lexicalanalyzer.Token;

public class Parser {
	public Queue<Token> queue;

	public Parser(String fileName) {
		// TODO Auto-generated constructor stub
		queue = getTokens(fileName);
	}

	private Queue<Token> getTokens(String fileName) {
		FileReader reader = new FileReader();
		try {
			Queue<Token> queue = new LinkedList<>(reader.getLexemes(fileName));

			return queue ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Program parse() {
		return parseProgram();
	}

	private Program parseProgram() {
		DeclList decl_list = parseDeclList();
		if(decl_list == null) System.err.println("syntax error");
		return new Program(decl_list);
	}
	private DeclList parseDeclList() {
		Decl decl = parseDecl();
		if(decl!= null) {
			DeclList declList = parseDeclList();
			return new DeclList(decl, declList);
		}
		return null;
	}
	private Decl parseDecl() {
		VarDecl varDecl = parseVarDecl();
		if(varDecl != null) {
			return new Decl(varDecl,null);
		}
		FunDecl funDecl = parseFunDecl();
		if(funDecl != null) {
			return new Decl(null,funDecl);
		}
		return null;
	}
	
	private FunDecl parseFunDecl() {
		TypeSpec typeSpec = parseTypeSpec();
		Ident ident = parseIdent();
		Token t =queue.peek();
		if(!t.getValue().equals("(")) {
			System.out.println("syntax error ( not found");
			return null;
		}
		queue.poll();
		ParamList paramList = parseParamList();
		if(paramList == null) {
			System.out.println("syntax error params not found");
			return null;
		}
		t =queue.peek();
		if(!t.getValue().equals(")")) {
			System.out.println("syntax error ) not found");
			return null;
		}
		queue.poll();
		
		CompoundStmt compundStmt = parseCompoundStmt();
		if(compundStmt!=null) {
			return new FunDecl();
		}
		return null;
	}

	private ParamList parseParamList() {
		Param param = parseParam();
		if(param != null ) {
			Params params = parseParams();
			if(params!=null)
				return new ParamList(param, params);
		}else {
			Token t =queue.peek();
			if(t.getValue().equals("void")) {
				queue.poll();
				return new ParamList(t);
			}
		}
		return null;
	}

	private Params parseParams() {
		Token t =queue.peek();
		String value = t.getValue();
		if(value.equals(",")) {
			queue.poll();
			Param param = parseParam();
			if(param != null) {
				Params params = parseParams();
				if(params != null) {
					return new Params(t, param, params);
				}
			}
		}
		System.out.println(", is missing");
		return null;
	}

	private Param parseParam() {
		TypeSpec typeSpec = parseTypeSpec();
		if(typeSpec != null) {
			Ident ident  = parseIdent();
			if(ident != null) {
				ParamsEnd paramsEnd = parseParamsEnd();
				if(paramsEnd != null) {
					return new Param(typeSpec, ident, paramsEnd);
				}
			}
		}
		return null;
	}

	private ParamsEnd parseParamsEnd() {
		Token t =queue.peek();
		String className = t.getClassName();
		if (className.equals("RIGHT_SQURE_B")) {
			queue.poll();
			Token t1 =queue.peek();
			className = t1.getClassName();
			if (className.equals("RIGHT_SQURE_B")) {
				queue.poll();
				return new ParamsEnd(t,t1);
			}
			System.out.println("missing ]");
			return null;
		}
		System.out.println("syntax error semicolon not found");
		return null;	
	}

	private TypeSpec parseTypeSpec() {
		Token t = queue.peek();
		String value = t.getValue();
		if(value.equals("void") || value.equals("bool")
		   || value.equals("int") || value.equals("float")) {
			queue.poll();
			return new TypeSpec(t);
		}
		System.out.println("syntax error type specifer not found");
		return null;
	}
	

	private Ident parseIdent() {
		Token t =queue.peek();
		String value = t.getClassName();
		if(value.equals("ID")) {
			queue.poll();
			return new Ident(t);
		}
		System.out.println("syntax error Identifier not found");
		return null;
	}
	private VarDeclEnd parseDeclEnd() {
		
		Token t =queue.peek();
		String className = t.getClassName();
		if(className.equals("SEMICOLON")) {
			queue.poll();
			return new VarDeclEnd(t);
		}else if (className.equals("RIGHT_SQURE_B")) {
			queue.poll();
			t =queue.peek();
			className = t.getClassName();
			if (className.equals("RIGHT_SQURE_B")) {
				queue.poll();
				return new VarDeclEnd(t);
			}
			System.out.println("missing ]");
			return null;
		}
		System.out.println("syntax error semicolon not found");
		return null;	
	}


	private VarDecl parseVarDecl() {
		TypeSpec typeSpec = parseTypeSpec();
		if(typeSpec == null ) {
			return null;
		}
		Ident ident = parseIdent();
		if(ident == null) {
			return null;
		}
		VarDeclEnd declEnd = parseDeclEnd();
		if(declEnd == null) {
			return null;
		}
		return new VarDecl(typeSpec, ident, declEnd);
	}


	private Program x() {
		// TODO Auto-generated method stub

		Token d = D();
		if (d == null) {
			System.out.println("Syntax error no digit");
			return null;
		}
		DeclList f = x_dash();

		return new Program(d, f);

	}

	private DeclList x_dash() {
		// TODO Auto-generated method stub
		Rule3 f = B();
		if (f != null) {
			DeclList r = x_dash();
			return new DeclList(f, r);
		}

		return null;
	}

	private Rule3 B() {
		// TODO Auto-generated method stub
		Token op = queue.peek();
		if (op == null) {
			return null;
		}
		queue.poll();
		Program r1 = x();
		if (r1 == null) {
			System.out.println("Syntax error expected rule1 object");
			return null;
		}

		return new Rule3(op, r1);
	}

	private Token D() {
		// TODO Auto-generated method stub
		Token t = queue.peek();
		if (t.myType == Token.DIGIT) {
			return queue.poll();
		}
		return null;

	}

	public static void main(String[] args) {

		Parser p = new Parser("Data/output.txt");
		Program root = p.parse();
		root.printNode();
	}
}
