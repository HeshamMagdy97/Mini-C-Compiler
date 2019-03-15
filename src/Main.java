import java.io.IOException;
import java.util.ArrayList;

import lexicalanalyzer.Token;
import lexicalanalyzer.Tokens;
import reader.FileReader;
import reader.Ireader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ireader reader = new FileReader();	
		Tokens tokens = new Tokens();
		try {
			String s = reader.readFile("Data/code.txt");
			String[] lexems = reader.getLexemes(s);
			ArrayList<Token> result = new ArrayList<>();
			for(String x : lexems) {
				for(Token token: tokens.tokens)
					if(token.validate(x)) {
						token.setValue(x);
						result.add(token);
					}
				System.out.println(x);
			}
			for(Token w:result) {
				System.out.println(w.toString());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println( t.validate(""));
		
	}

}
