package parser;

public class Param implements Node {

	TypeSpec typeSpec;
	Ident ident;
	ParamsEnd paramsEnd;
	
	
	public Param(TypeSpec typeSpec, Ident ident, ParamsEnd paramsEnd) {
		this.typeSpec = typeSpec;
		this.ident = ident;
		this.paramsEnd = paramsEnd;
	}


	@Override
	public void printNode() {
		System.out.println("------- Param -------------");
		System.out.print(" type spec= ");
		if(typeSpec!=null)typeSpec.printNode(); else System.out.println("null");
		System.out.print( " ident = ");
		if(ident!=null) ident.printNode() ; else System.out.println("null");
		System.out.print( " Var Decl End = ");
		if(paramsEnd!=null) paramsEnd.printNode() ; else System.out.println("null");
		System.out.println("--------------------");		
	}

}
