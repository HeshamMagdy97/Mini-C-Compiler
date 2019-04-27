package parser;

import lexicalanalyzer.Token;

public class Ident implements Node {
	Token id;
	
	
	public Ident(Token id) {
		super();
		this.id = id;
	}


	@Override
	public void printNode() {
		System.out.println("-------Ident-------------");
		System.out.println("Id : value = "+id.getValue());
		System.out.println("--------------------");
	}

}
