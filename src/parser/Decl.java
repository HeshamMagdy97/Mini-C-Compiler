package parser;

public class Decl implements Node {

	
	VarDecl varDecl;
	FunDecl funDecl;
	
	public Decl(VarDecl varDecl , FunDecl funDecl)
	{
		this.varDecl = varDecl;
		this.funDecl = funDecl;
	}
	@Override
	public void printNode() {
		System.out.println("------- DECL -------------");
		System.out.print(" var decl = ");
		if(varDecl!=null)varDecl.printNode(); else System.out.println("null");
		System.out.print( " fun decl = ");
		if(funDecl!=null) funDecl.printNode() ; else System.out.println("null");
		System.out.println("--------------------");
	}

}
