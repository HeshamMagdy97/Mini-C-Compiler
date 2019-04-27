package parser;

public class Program implements Node{
	DeclList decl_list;
	
	public Program(DeclList decl_list)
	{
		this.decl_list = decl_list;
	}

	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------PROGRAM-------------");
		if(decl_list!=null) decl_list.printNode() ; else System.out.println("null");
		System.out.println("--------------------");
	}

	

}
