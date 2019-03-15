package lexicalanalyzer;
import java.util.regex.Matcher;
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
	public boolean validate_2(String code) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(code);
		int index = -1;
		while (matcher.find())
		{
			index = matcher.start();
			System.out.println("Found a match: " + matcher.group());
			//System.out.println("Start position: " + matcher.start());
			//System.out.println("End position: " + matcher.end());
		}
		return index != -1;
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
