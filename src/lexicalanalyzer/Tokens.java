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
	final Token intToken = new Token("INT", "[+-]?[0-9]+(?!\\.)[0-9]+(?<!\\.)[0-9]+");
	final Token floatToken = new Token("FLOAT", "[-+]?[0-9]*\\.[0-9]+");
	final Token semiToken = new Token("SEMICOLON", ";");
	final Token forToken = new Token("FOR", "for");
	final Token multiCommentToken = new Token("MULTI_COMMENT","(?s)\\/\\*(.*)\\*\\/");
	final Token bitWiseOrToken = new Token("BITWISE_OR", "\\s\\|\\|\\s");
	
	final Token gotoToken = new Token("GOTO", "goto");
	final Token ifToken = new Token("IF", "for");
	final Token longToken = new Token("LONG", "long");
	final Token registerToken = new Token("REGISTER", "register");
	final Token returnToken = new Token("RETURN", "return");
	final Token shortToken = new Token("SHORT", "short");
	final Token signedToken = new Token("SIGNED", "signed");
	final Token sizeOfToken = new Token("SIZEOF", "sizeof");
	final Token staticToken = new Token("STATIC", "static");
	final Token structToken = new Token("STRUCT", "struct");
	final Token switchToken = new Token("SWITCH", "switch");
	final Token typedefToken = new Token("TYPEDEF", "typedef");
    final Token unionToken=new Token("UNION","union");
    final Token voidToken=new Token ("VOID","void");
	final Token volatileToken = new Token("VOLATILE", "volatile");
    final Token whileToken=new Token("WHILE","while");
    final Token leftcurlyToken=new Token("LEFT_CURLY_B","}");
    final Token rightcurlyToken=new Token("RIGHT_CURLY_B","\\{") ;
    final Token rightsqureToken=new Token("RIGHT_SQURE_B","\\[");
    final Token leftsqureToken=new Token("LEFT_SQURE_B","\\]");
    final Token rightroundToken=new Token("RIGHT_ROUND_B","\\(");
    final Token leftroundToken=new Token("LEFT_ROUND_B","\\)");
    final Token commaToken = new Token("COMMA", "\\,");
    final Token dotToken = new Token("DOT", "\\.");
    final Token notToken = new Token("NOT", "!");
    final Token assignOperatorToken = new Token("ASSIGN_OPERATOR", "=");
    final Token preprocessorToken = new Token("PREPROCESSOR", "#");
    final Token backwordSlashToken = new Token("BACKWARD_SLASH", "\\\\");
    final Token minusToken = new Token("MINUS", "-");
    final Token plusToken = new Token("PLUS", "\\+");
    final Token asterickToken = new Token("ASTERICK", "\\*");
    final Token divideToken = new Token("DIVIDE", "/");
    final Token modToken = new Token("MOD", "%");
    final Token lessthanToken = new Token("LESSTHAN", "<");
    final Token greaterthanToken = new Token("GREATERTHAN", ">");
    final Token lessEqToken = new Token("LESS_EQ", "<=");
    final Token greatEqToken = new Token("GREAT_EQ", ">=");
    final Token equalToken = new Token("EQUAL", "==");
    final Token notEqualToken = new Token("NOT_EQUAL","!=");
    final Token andToken = new Token("AND", "&&");
    final Token orToken = new Token("OR", "||"); 
    
	
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
