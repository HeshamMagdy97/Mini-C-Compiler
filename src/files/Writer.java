package files;

import java.io.IOException;
import java.util.ArrayList;

import lexicalanalyzer.Token;
import java.io.FileWriter;

public class Writer {
	
	public static void writeTokens(ArrayList<Token> tokens, String filePath) throws IOException {
		FileWriter writer = new FileWriter(filePath);
        for(int i=0;i<tokens.size();i++){
            writer.write(tokens.get(i).toString());
            writer.write("\n");
        }
        writer.close();
    }

}
