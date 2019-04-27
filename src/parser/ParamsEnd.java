package parser;

import lexicalanalyzer.Token;

public class ParamsEnd implements Node {

	Token leftBracket,rightBracket;
	
	
	public ParamsEnd(Token leftBracket, Token rightBracket) {
		this.leftBracket = leftBracket;
		this.rightBracket = rightBracket;
	}


	@Override
	public void printNode() {
		System.out.println("-------Params End-------------");
		System.out.println("VAR DECL END : left Bracket = "+leftBracket.getValue() );
		System.out.println("VAR DECL END : right Bracket = "+rightBracket.getValue() );
		if(leftBracket == null && rightBracket == null) System.out.println("NULL");
		System.out.println("--------------------");
	
	}

}
