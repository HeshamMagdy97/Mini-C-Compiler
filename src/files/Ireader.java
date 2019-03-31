package files;

import java.io.IOException;

public interface Ireader {
	public String readFile(String filePath) throws IOException;
	public String[] getLexemes(String string);
}
