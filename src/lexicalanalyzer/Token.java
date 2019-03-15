package lexicalanalyzer;
import java.util.regex.Pattern;


public class Token {
	private String value;
	private String className;
	private String regex;
	
	public Token(String className, String regex) {
		this.className = className;
		this.regex = regex;
	}
	public boolean validate(String lexicalUnit) {
		return Pattern.matches(regex, lexicalUnit);
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getClassName() {
		return className;
	}
	public void setToken(String className) {
		this.className = className;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<"+this.className+"> :"+this.value;
	}
}
