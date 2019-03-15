package reader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader implements Ireader {

	@Override
	public String readFile(String filePath) throws IOException {
		// TODO Auto-generated method stub
		String fileString = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);

		return fileString;
	}

}
