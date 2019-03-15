package lexicalanalyzer;

import java.util.ArrayList;

public class Tokens {
	public ArrayList<Token> tokens;
	final Token autoToken = new Token("AUTO", "auto");
	final Token newToken = new Token("NEW", "new");
	final Token trueToken = new Token("TRUE", "true");
	final Token falseToken = new Token("FALSE", "false");
	final Token breakToken = new Token("BREAK", "break");
	final Token boolToken = new Token("BOOL", "bool");
	final Token caseToken = new Token("CASE", "case");
	final Token charToken = new Token("CHAR", "char");
	final Token constToken = new Token("CONST", "const");
	final Token continueToken = new Token("CONTINUE", "continue");
	final Token defaultToken = new Token("DEFAULT", "default");
	final Token doToken = new Token("DO", "do");
	final Token doubletToken = new Token("DOUBLE", "double");
	final Token elseToken = new Token("ELSE", "else");
	final Token enumToken = new Token("ENUM", "enum");
	final Token externToken = new Token("EXTERN", "extern");
	final Token intToken = new Token("INT", "[+-]?[0-9]+");
	final Token floatToken = new Token("FLOAT", "[-+]?[0-9]*\\.?[0-9]+");
	final Token semiToken = new Token("SEMICOLON", ";");

	final Token forToken = new Token("FOR", "for");
	final Token multiCommentToken = new Token("MULTI_COMMENT","(?s)\\/\\*(.*)\\*\\/");
	final Token bitWiseOrToken = new Token("BITWISE_OR","\\s\\|\\|\\s");

	
	public Tokens() {
		tokens = new ArrayList<Token>();
		//USE JAVA REFACTORING AND ADD ATTRIBUTES DINAMICALYY
		tokens.add(autoToken);
		tokens.add(newToken);
		tokens.add(trueToken);
		tokens.add(falseToken);
		tokens.add(breakToken);
		tokens.add(boolToken);
		tokens.add(caseToken);
		tokens.add(floatToken);
		tokens.add(intToken);
		tokens.add(semiToken);
		tokens.add(multiCommentToken);
		tokens.add(bitWiseOrToken);
	}
}
