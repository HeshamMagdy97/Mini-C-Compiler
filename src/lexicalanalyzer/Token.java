package lexicalanalyzer;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Token {
	private String value;
	private String className;
	private String regex;
	private Pattern pattern;
	private int startpos;
	private int endpos;
	
	public Token(String className, String regex) {
		this.className = className;
		this.regex = regex;
		this.pattern = Pattern.compile(regex);
		this.startpos = -1;
		this.endpos = -1;
	}
	public boolean validate(String lexicalUnit) {
		return Pattern.matches(regex, lexicalUnit);
	}
	public ArrayList<Token> validate_2(String code) {
		
		Matcher matcher = pattern.matcher(code);
		ArrayList<Token> found = new ArrayList<>();
		while (matcher.find())
		{
			String value = matcher.group();
			Token x = new Token(className, regex);
			x.setValue(value);
			x.startpos = matcher.start();
			x.endpos = matcher.end();
			
			found.add(x);
		}
		//System.out.println(found);
		return found;
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
	
	public int getStartpos() {
		return startpos;
	}
	public void setStartpos(int startpos) {
		this.startpos = startpos;
	}
	public int getEndpos() {
		return endpos;
	}
	public void setEndpos(int endpos) {
		this.endpos = endpos;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<"+this.className+"> :"+this.value ;
	}
}
