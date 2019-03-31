package lexicalanalyzer;

import java.util.ArrayList;

public class Tokens {
	public ArrayList<Token> tokens;
	Token autoToken = new Token("AUTO", "auto");
	Token newToken = new Token("NEW", "new");
	Token trueToken = new Token("TRUE", "true");
	Token falseToken = new Token("FALSE", "false");
	Token breakToken = new Token("BREAK", "break");
	Token boolToken = new Token("BOOL", "bool");
	Token caseToken = new Token("CASE", "case");
	Token charToken = new Token("CHAR", "char");
	Token constToken = new Token("CONST", "const");
	Token continueToken = new Token("CONTINUE", "continue");
	Token defaultToken = new Token("DEFAULT", "default");
	Token doToken = new Token("DO", "do");
	Token doubletToken = new Token("DOUBLE", "double");
	Token elseToken = new Token("ELSE", "else");
	Token enumToken = new Token("ENUM", "enum");
	Token externToken = new Token("EXTERN", "extern");
	Token intLiteralToken = new Token("INTEGRAL_LITERAL", "[+-]?[0-9]+(?!\\.)[0-9]+(?<!\\.)[0-9]+");
	Token intToken = new Token("INT", "int");

	Token floatToken = new Token("FLOAT", "[-+]?[0-9]*\\.[0-9]+");
	Token semiToken = new Token("SEMICOLON", ";");
	Token forToken = new Token("FOR", "for");
	Token multiCommentToken = new Token("MULTI_COMMENT", "(?s)\\/\\*(.*)\\*\\/");
	Token singleCommentToken = new Token("SINGLE_COMMENT","\\/\\/.*");
	Token bitWiseOrToken = new Token("BITWISE_OR", "\\s\\|\\|\\s");

	Token gotoToken = new Token("GOTO", "goto");
	Token ifToken = new Token("IF", "for");
	Token longToken = new Token("LONG", "long");
	Token registerToken = new Token("REGISTER", "register");
	Token returnToken = new Token("RETURN", "return");
	Token shortToken = new Token("SHORT", "short");
	Token signedToken = new Token("SIGNED", "signed");
	Token sizeOfToken = new Token("SIZEOF", "sizeof");
	Token staticToken = new Token("STATIC", "static");
	Token structToken = new Token("STRUCT", "struct");
	Token switchToken = new Token("SWITCH", "switch");
	Token typedefToken = new Token("TYPEDEF", "typedef");
	Token unionToken = new Token("UNION", "union");
	Token voidToken = new Token("VOID", "void");
	Token volatileToken = new Token("VOLATILE", "volatile");
	Token whileToken = new Token("WHILE", "while");
	Token leftcurlyToken = new Token("LEFT_CURLY_B", "}");
	Token rightcurlyToken = new Token("RIGHT_CURLY_B", "\\{");
	Token rightsqureToken = new Token("RIGHT_SQURE_B", "\\[");
	Token leftsqureToken = new Token("LEFT_SQURE_B", "\\]");
	Token rightroundToken = new Token("RIGHT_ROUND_B", "\\(");
	Token leftroundToken = new Token("LEFT_ROUND_B", "\\)");
	Token commaToken = new Token("COMMA", "\\,");
	Token dotToken = new Token("DOT", "\\.");
	Token notToken = new Token("NOT", "!");
	Token assignOperatorToken = new Token("ASSIGN_OPERATOR", "=");
	Token preprocessorToken = new Token("PREPROCESSOR", "#");
	Token backwordSlashToken = new Token("BACKWARD_SLASH", "\\\\");
	Token minusToken = new Token("MINUS", "-");
	Token plusToken = new Token("PLUS", "\\+");
	Token asterickToken = new Token("ASTERICK", "\\*");
	Token divideToken = new Token("DIVIDE", "/");
	Token modToken = new Token("MOD", "%");
	Token lessthanToken = new Token("LESSTHAN", "<");
	Token greaterthanToken = new Token("GREATERTHAN", ">");
	Token lessEqToken = new Token("LESS_EQ", "<=");
	Token greatEqToken = new Token("GREAT_EQ", ">=");
	Token equalToken = new Token("EQUAL", "==");
	Token notEqualToken = new Token("NOT_EQUAL", "!=");
	Token andToken = new Token("AND", "&&");
	Token orToken = new Token("OR", "||");
	Token idToken = new Token("ID", "[A-Za-z][A-Za-z0-9_]*");
	Token stringLiteral = new Token("STRING_LITERAL","\\\".*?\\\"");
	Token charLiteral = new Token("CHAR_LITERAL","\\'[a-zA-Z]\\'");
	public Tokens() {
		tokens = new ArrayList<Token>();
		// USE JAVA REFACTORING AND ADD ATTRIBUTES DINAMICALYY
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
		tokens.add(idToken);
		tokens.add(singleCommentToken);
		tokens.add(stringLiteral);
		tokens.add(intLiteralToken);
	}
}
