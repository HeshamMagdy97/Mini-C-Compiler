package parser;

import lexicalanalyzer.Token;

public class Params implements Node {
	Token comma;
	Param param;
	Params params;
	
	
	public Params(Token comma, Param param, Params params) {
		this.comma = comma;
		this.param = param;
		this.params = params;
	}


	@Override
	public void printNode() {
		System.out.println("------- VAR DECL -------------");
		System.out.print(" type spec= ");
		if(comma!=null)System.out.println(comma.getValue()); else System.out.println("null");
		System.out.print( " ident = ");
		if(param!=null) param.printNode() ; else System.out.println("null");
		System.out.print( " Var Decl End = ");
		if(params!=null) params.printNode() ; else System.out.println("null");
		if(param == null && comma == null && params == null)
			System.out.println("null");
		System.out.println("--------------------");		
	}

}
