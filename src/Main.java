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
				System.out.println(found);
				result.addAll(found);
			}
		}

		System.out.println("------------");
		System.out.println();
		ArrayList<Token> resultI = new ArrayList<>();
		String[] matches = s.split("\\s+");
		for (String x : matches) {
			int arrSize = resultI.size();
			for (Token w : result) {
				if(w.getValue().contains(x))
					if(!resultI.contains(w))
						resultI.add(w);
					else
						arrSize++;
			}
			if(arrSize == resultI.size()) {
				System.err.println(x);
				break;
			}
		}
		System.out.println(resultI);


	}

}
