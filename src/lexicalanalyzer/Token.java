package lexicalanalyzer;
import java.util.regex.Pattern;


public class Token {
	private String name;
	private String token;
	private String regex;
	private Pattern pattern;
	
	public Token(String name, String token, String regex) {
		this.token = token;
		this.regex = regex;
		pattern = Pattern.compile(regex);
		this.name = name;
	}
	public boolean validate(String lexicalUnit) {
		return Pattern.matches(regex, lexicalUnit);
	}
	
}
