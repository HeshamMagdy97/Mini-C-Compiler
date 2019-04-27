package parser;

import lexicalanalyzer.Token;

public class VarDeclEnd implements Node {

	Token token;
	
	public VarDeclEnd(Token token) {
		this.token = token;
	}

	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------VAR DECL END-------------");
		System.out.println("VAR DECL END : end = "+token.getValue() );
		System.out.println("--------------------");
	}

}
