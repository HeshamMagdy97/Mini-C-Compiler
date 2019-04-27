/*
 * @author  Nora Abd El-Hameed
 * @version 1.0
 * @since   2017-3-27
 */
package parser;

public class DeclList implements Node{
	
	Decl decl;
	DeclList declList;
	
	public DeclList(Decl decl , DeclList declList)
	{
		this.decl = decl;
		this. declList = declList;
	}

	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------DECL LIST-------------");
		System.out.print(" DECL = ");
		if(decl!=null)decl.printNode(); else System.out.println("null");
		System.out.print( " DECL LIST = ");
		if(declList!=null) declList.printNode() ; else System.out.println("null");
		System.out.println("--------------------");
	}

	
}
