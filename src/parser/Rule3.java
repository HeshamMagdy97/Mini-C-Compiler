/*
 * @author  Nora Abd El-Hameed
 * @version 1.0
 * @since   2017-3-27
 */
package parser;

import Lexical.Token;

public class Rule3 implements Node{

	Token op;
	Program x;
	public Rule3(Token op, Program x){
		this.op = op;
		this.x = x;
	}
	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Rule 3-------------");
		System.out.println("Rule3 : OP = "+op.value + " Rule1 = ");x.printNode() ;
		System.out.println("--------------------");
	}
	
}
