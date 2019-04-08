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
				// System.out.println(found);
				result.addAll(found);
			}
		}
		System.out.println(result);
		Collections.sort(result, Comparator.comparing(Token::getStartpos));
		System.out.println(result);

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
					System.out.println(result.get(j).getValue());
					result.remove(j);
					j--;
				}
			}
		}

		System.out.println(result);
		ErrorHandler errorhandler = new ErrorHandler(s,result);
		errorhandler.printError();
		try {
			Writer.writeTokens(result, "Data/output.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
