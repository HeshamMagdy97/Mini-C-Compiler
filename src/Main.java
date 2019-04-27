
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import errors.ErrorHandler;
import files.FileReader;
import files.Ireader;
import files.Writer;
import lexicalanalyzer.Token;
import lexicalanalyzer.Tokens;

public class Main {
	public static void toknize() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ireader reader = new FileReader();
		Tokens tokens = new Tokens();
		String s = "";
		try {
			s = reader.readFile("Data/code.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<Token> result = new ArrayList<>(), found = new ArrayList<>();
		for (Token token : tokens.tokens) {
			found = token.validate_2(s);
			if (!found.isEmpty()) {
				result.addAll(found);
				//System.out.println(found);
			}
		}
		//System.out.println(result);
		Collections.sort(result, Comparator.comparing(Token::getStartpos));
		for (int i = 0; i < result.size(); i++) {
			for (int j = i + 1; j < result.size(); j++) {
				if (result.get(i).getStartpos() == result.get(j).getStartpos()) {
					if (result.get(j).getClassName().equals("ID")) {
						result.remove(j);
					}
				}
			}
		}

		for (int i = 0; i < result.size(); i++) {
			for (int j = i + 1; j < result.size(); j++) {

				if (result.get(i).getStartpos() <= result.get(j).getStartpos()
						&& result.get(i).getEndpos() >= result.get(j).getEndpos()) {
					if(result.get(j).getClassName().equals("DOT")&&
					   result.get(j-1).getClassName().equals("FLOAT")&&
					   result.get(j+1).getClassName().equals("INT_LITERAL")) {
						result.remove(j-1);
						j--;
						continue;

					}						
					result.remove(j);
					j--;
				}
			}
		}

	//	System.out.println(result);
		ErrorHandler errorhandler = new ErrorHandler(s,result);
		errorhandler.printError();
		try {
			Writer.writeTokens(result, "Data/output.txt");
			reader.getLexemes("Data/output.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
