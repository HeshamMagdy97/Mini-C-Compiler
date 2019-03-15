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
			ArrayList<Token> result = new ArrayList<>();
			System.out.println(s);
			for(Token token: tokens.tokens)
				if(token.validate_2(s)) {
					//token.setValue(x);
					result.add(token);
					System.out.println(token.toString());
				}
			/*String[] lexems = reader.getLexemes(s);
			
			ArrayList<Token> result = new ArrayList<>();
			for(String x : lexems) {
				int list_size = result.size();
				for(Token token: tokens.tokens)
					if(token.validate(x)) {
						token.setValue(x);
						result.add(token);
						System.out.println(token.toString());
						break;
					}
				if(list_size == result.size()){
					System.err.println("Undifined word " + x);
					break;
				}
				System.out.println(x);
			}*/
			System.out.println("------------");

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
