package parser;

import lexicalanalyzer.Token;

public class TypeSpec implements Node {

	Token typeToken;

	public TypeSpec(Token typeToken) {
		this.typeToken = typeToken;
	}

	@Override
	public void printNode() {
		System.out.println("-------Type Spec-------------");
		System.out.println("Type Spec : value = "+typeToken.getValue());
		System.out.println("--------------------");
	}

}
