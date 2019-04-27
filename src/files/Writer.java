package files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import lexicalanalyzer.Token;

public class Writer {
	
	public static void writeTokens(ArrayList<Token> tokens, String filePath) throws IOException {
		FileOutputStream fout= new FileOutputStream (filePath);
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(tokens);
		fout.close();

/*
		FileWriter writer = new FileWriter(filePath);
        for(int i=0;i<tokens.size();i++){
            writer.write(tokens.get(i).toString());
            writer.write("\n");
        }
        writer.close();*/
    }

}
