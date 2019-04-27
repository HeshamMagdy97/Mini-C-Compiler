package parser;

import lexicalanalyzer.Token;

public class ParamList implements Node {
	Param param;
	Params params;
	Token voidToken;

	public ParamList(Param param, Params params) {
		this.param = param;
		this.params = params;
	}

	public ParamList(Token voidToken) {
		this.voidToken = voidToken;
	}

	@Override
	public void printNode() {
		System.out.println("------- PARAMS LIST -------------");
		System.out.print(" param= ");
		if(param!=null)param.printNode(); else System.out.println("null");
		System.out.print( " params = ");
		if(params!=null) params.printNode() ; else System.out.println("null");
		System.out.print( " Void Token = ");
		if(voidToken!=null) voidToken.getValue() ; else System.out.println("null");
		System.out.println("--------------------");		
	}

}
