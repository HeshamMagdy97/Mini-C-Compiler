import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lexicalanalyzer.Token;
import reader.FileReader;
import reader.Ireader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Token t = new Token("email", "EMAIL", "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*");
		Ireader reader = new FileReader();	
		
		try {
			System.out.println(reader.
					readFile("Data/code.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println( t.validate(""));
		
	}

}
