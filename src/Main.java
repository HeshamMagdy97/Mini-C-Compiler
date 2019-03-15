import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lexicalanalyzer.Token;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Token t = new Token("email", "EMAIL", "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*");
				
		System.out.println( t.validate("zeinab@a.com"));
		
	}

}
