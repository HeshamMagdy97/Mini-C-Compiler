package files;

import java.io.IOException;
import java.util.ArrayList;

import lexicalanalyzer.Token;

public interface Ireader {
	public String readFile(String filePath) throws IOException;
	public ArrayList<Token> getLexemes(String filePath) throws IOException;
}
