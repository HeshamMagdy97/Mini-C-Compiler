package parser;

public class VarDecl implements Node{

	TypeSpec typeSpec;
	Ident ident;
	VarDeclEnd varDeclEnd;
	
	
	public VarDecl(TypeSpec typeSpec, Ident ident, VarDeclEnd varDeclEnd) {
		super();
		this.typeSpec = typeSpec;
		this.ident = ident;
		this.varDeclEnd = varDeclEnd;
	}


	@Override
	public void printNode() {
		System.out.println("------- VAR DECL -------------");
		System.out.print(" type spec= ");
		if(typeSpec!=null)typeSpec.printNode(); else System.out.println("null");
		System.out.print( " ident = ");
		if(ident!=null) ident.printNode() ; else System.out.println("null");
		System.out.print( " Var Decl End = ");
		if(varDeclEnd!=null) varDeclEnd.printNode() ; else System.out.println("null");
		System.out.println("--------------------");		
	}

}
