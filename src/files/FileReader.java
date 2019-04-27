package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import lexicalanalyzer.Token;

public class FileReader implements Ireader {

	@Override
	public String readFile(String filePath) throws IOException {
		// TODO Auto-generated method stub
		String fileString = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
		return fileString;
	}

	@Override
	public ArrayList<Token> getLexemes(String filePath) throws IOException {
		FileInputStream fin= new FileInputStream (filePath);
		ObjectInputStream ois = new ObjectInputStream(fin);
		ArrayList<Token> tokens = null;
		try {
			tokens = (ArrayList<Token>)ois.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fin.close();
		System.out.println(tokens);
		return tokens;
		
	}

}
