package lexicalanalyzer;

import java.util.ArrayList;

//75
public class Tokens {
	public ArrayList<Token> tokens;
	/*
	 * <<<<<<< HEAD Token autoToken = new Token("AUTO", "auto"); Token newToken =
	 * new Token("NEW", "new"); Token trueToken = new Token("TRUE", "true"); Token
	 * falseToken = new Token("FALSE", "false"); Token breakToken = new
	 * Token("BREAK", "break"); Token boolToken = new Token("BOOL", "bool"); Token
	 * caseToken = new Token("CASE", "case"); Token charToken = new Token("CHAR",
	 * "char"); Token constToken = new Token("CONST", "const"); Token continueToken
	 * = new Token("CONTINUE", "continue"); Token defaultToken = new
	 * Token("DEFAULT", "default"); Token doToken = new Token("DO", "do"); Token
	 * doubletToken = new Token("DOUBLE", "double"); Token elseToken = new
	 * Token("ELSE", "else"); Token enumToken = new Token("ENUM", "enum"); Token
	 * externToken = new Token("EXTERN", "extern"); Token intLiteralToken = new
	 * Token("INTEGRAL_LITERAL", "[+-]?[0-9]+(?!\\.)[0-9]+(?<!\\.)[0-9]+"); Token
	 * intToken = new Token("INT", "int");
	 * 
	 * Token floatToken = new Token("FLOAT", "[-+]?[0-9]*\\.[0-9]+"); Token
	 * semiToken = new Token("SEMICOLON", ";"); Token forToken = new Token("FOR",
	 * "for"); Token multiCommentToken = new Token("MULTI_COMMENT",
	 * "(?s)\\/\\*(.*)\\*\\/"); Token singleCommentToken = new
	 * Token("SINGLE_COMMENT","\\/\\/.*"); Token bitWiseOrToken = new
	 * Token("BITWISE_OR", "\\s\\|\\|\\s");
	 * 
	 * Token gotoToken = new Token("GOTO", "goto"); Token ifToken = new Token("IF",
	 * "for"); Token longToken = new Token("LONG", "long"); Token registerToken =
	 * new Token("REGISTER", "register"); Token returnToken = new Token("RETURN",
	 * "return"); Token shortToken = new Token("SHORT", "short"); Token signedToken
	 * = new Token("SIGNED", "signed"); Token sizeOfToken = new Token("SIZEOF",
	 * "sizeof"); Token staticToken = new Token("STATIC", "static"); Token
	 * structToken = new Token("STRUCT", "struct"); Token switchToken = new
	 * Token("SWITCH", "switch"); Token typedefToken = new Token("TYPEDEF",
	 * "typedef"); Token unionToken = new Token("UNION", "union"); Token voidToken =
	 * new Token("VOID", "void"); Token volatileToken = new Token("VOLATILE",
	 * "volatile"); Token whileToken = new Token("WHILE", "while"); Token
	 * leftcurlyToken = new Token("LEFT_CURLY_B", "}"); Token rightcurlyToken = new
	 * Token("RIGHT_CURLY_B", "\\{"); Token rightsqureToken = new
	 * Token("RIGHT_SQURE_B", "\\["); Token leftsqureToken = new
	 * Token("LEFT_SQURE_B", "\\]"); Token rightroundToken = new
	 * Token("RIGHT_ROUND_B", "\\("); Token leftroundToken = new
	 * Token("LEFT_ROUND_B", "\\)"); Token commaToken = new Token("COMMA", "\\,");
	 * Token dotToken = new Token("DOT", "\\."); Token notToken = new Token("NOT",
	 * "!"); Token assignOperatorToken = new Token("ASSIGN_OPERATOR", "="); Token
	 * preprocessorToken = new Token("PREPROCESSOR", "#"); Token backwordSlashToken
	 * = new Token("BACKWARD_SLASH", "\\\\"); Token minusToken = new Token("MINUS",
	 * "-"); Token plusToken = new Token("PLUS", "\\+"); Token asterickToken = new
	 * Token("ASTERICK", "\\*"); Token divideToken = new Token("DIVIDE", "/"); Token
	 * modToken = new Token("MOD", "%"); Token lessthanToken = new Token("LESSTHAN",
	 * "<"); Token greaterthanToken = new Token("GREATERTHAN", ">"); Token
	 * lessEqToken = new Token("LESS_EQ", "<="); Token greatEqToken = new
	 * Token("GREAT_EQ", ">="); Token equalToken = new Token("EQUAL", "=="); Token
	 * notEqualToken = new Token("NOT_EQUAL", "!="); Token andToken = new
	 * Token("AND", "&&"); Token orToken = new Token("OR", "||"); Token idToken =
	 * new Token("ID", "[A-Za-z][A-Za-z0-9_]*"); Token stringLiteral = new
	 * Token("STRING_LITERAL","\\\".*?\\\""); Token charLiteral = new
	 * Token("CHAR_LITERAL","\\'[a-zA-Z]\\'"); public Tokens() { tokens = new
	 * ArrayList<Token>(); // USE JAVA REFACTORING AND ADD ATTRIBUTES DINAMICALYY
	 * tokens.add(autoToken); tokens.add(newToken); tokens.add(trueToken);
	 * tokens.add(falseToken); tokens.add(breakToken); =======
	 */
	final Token autoToken = new Token("AUTO", "\\bauto\\b");
	final Token newToken = new Token("NEW", "\\bnew\\b");
	final Token trueToken = new Token("TRUE", "\\btrue\\b");
	final Token falseToken = new Token("FALSE", "\\bfalse\\b");
	final Token breakToken = new Token("BREAK", "\\bbreak\\b");
	final Token boolToken = new Token("BOOL", "\\bbool\\b");
	final Token caseToken = new Token("CASE", "\\bcase\\b");
	final Token charToken = new Token("CHAR", "\\bchar\\b");
	final Token constToken = new Token("CONST", "\\bconst\\b");
	final Token continueToken = new Token("CONTINUE", "\\bcontinue\\b");
	final Token defaultToken = new Token("DEFAULT", "\\bdefault\\b");
	final Token doToken = new Token("DO", "\\bdo\\b");
	final Token doubletToken = new Token("DOUBLE", "\\bdouble\\b");
	final Token elseToken = new Token("ELSE", "\\belse\\b");
	final Token enumToken = new Token("ENUM", "\\benum\\b");
	final Token externToken = new Token("EXTERN", "\\bextern\\b");
	final Token intliToken = new Token("INT_LITERAL", "\\b\\d+\\b");
	final Token floatToken = new Token("FLOAT", "float");
	final Token floatLiteral = new Token("FLOAT", "\\d\\d*\\.\\d\\d*");

	final Token semiToken = new Token("SEMICOLON", ";");
	final Token forToken = new Token("FOR", "\\bfor\\b");
	final Token multiCommentToken = new Token("MULTI_COMMENT", "(?s)\\/\\*(.*)\\*\\/");
	final Token bitWiseOrToken = new Token("BITWISE_OR", "\\s\\|\\|\\s");
	final Token gotoToken = new Token("GOTO", "goto");
	final Token ifToken = new Token("IF", "for");
	final Token longToken = new Token("LONG", "long");
	final Token registerToken = new Token("REGISTER", "\\bregister\\b");
	final Token returnToken = new Token("RETURN", "\\breturn\\b");
	final Token shortToken = new Token("SHORT", "\\bshort\\b");
	final Token signedToken = new Token("SIGNED", "\\bsigned\\b");
	final Token sizeOfToken = new Token("SIZEOF", "\\bsizeof\\b");
	final Token staticToken = new Token("STATIC", "\\bstatic\\b");
	final Token structToken = new Token("STRUCT", "\\bstruct\\b");
	final Token switchToken = new Token("SWITCH", "\\bswitch\\b");
	final Token typedefToken = new Token("TYPEDEF", "\\btypedef\\b");
	final Token unionToken = new Token("UNION", "\\bunion\\b");
	final Token voidToken = new Token("VOID", "\\bvoid\\b");
	final Token volatileToken = new Token("VOLATILE", "\\bvolatile");
	final Token whileToken = new Token("WHILE", "\\bwhile\\b");
	final Token leftcurlyToken = new Token("LEFT_CURLY_B", "\\}");
	final Token rightcurlyToken = new Token("RIGHT_CURLY_B", "\\{");
	final Token rightsqureToken = new Token("RIGHT_SQURE_B", "\\[");
	final Token leftsqureToken = new Token("LEFT_SQURE_B", "\\]");
	final Token rightroundToken = new Token("RIGHT_ROUND_B", "\\(");
	final Token leftroundToken = new Token("LEFT_ROUND_B", "\\)");
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
	final Token notEqualToken = new Token("NOT_EQUAL", "!=");
	final Token andToken = new Token("AND", "&&");
	final Token orToken = new Token("OR", "\\|\\|");
	final Token bitwiseNotToken = new Token("BITWISE_NOT", "~");
	final Token bitwiseAndToken = new Token("BITWISE_AND", "&");
	final Token bitWiseXorToken = new Token("BITWISE_XOR", "\\s\\|\\s");
	final Token leftShiftToken = new Token("LEFT_SHIFT", ">>");
	final Token rightShiftToken = new Token("RIGHT_SHIFT", "<<");
	final Token eofToken = new Token("EOF", "\\z|\\Z|\\$");
	final Token charLiteralToken = new Token("CHAR_LITERAL", "'[a-zA-z]'{1}");
	final Token stringLiteralToken = new Token("STRING_LITERAL", "\"[a-zA-Z]+\"");
	final Token idToken = new Token("ID", "[A-Za-z][A-Za-z0-9_]*");
	final Token intToken = new Token("INT", "int");
	final Token singleCommentToken = new Token("SINGLE_COMMENT", "\\/\\/.*");

	public Tokens() {
		tokens = new ArrayList<Token>();
		// USE JAVA REFACTORING AND ADD ATTRIBUTES DINAMICALYY
		tokens.add(intliToken);
		tokens.add(bitWiseOrToken);
		tokens.add(boolToken);
		tokens.add(caseToken);
		tokens.add(breakToken);
		tokens.add(autoToken);
		tokens.add(andToken);
		tokens.add(assignOperatorToken);
		tokens.add(asterickToken);
		tokens.add(backwordSlashToken);
		tokens.add(bitWiseXorToken);
		tokens.add(bitwiseAndToken);
		tokens.add(bitwiseNotToken);
		tokens.add(charToken);
		tokens.add(commaToken);
		tokens.add(constToken);
		tokens.add(continueToken);
		tokens.add(defaultToken);
		tokens.add(divideToken);
		tokens.add(doToken);
		tokens.add(dotToken);
		tokens.add(doubletToken);
		tokens.add(elseToken);
		tokens.add(enumToken);
		tokens.add(equalToken);
		tokens.add(externToken);
		tokens.add(forToken);
		tokens.add(falseToken);
		tokens.add(floatToken);
		tokens.add(floatLiteral);
		tokens.add(gotoToken);
		tokens.add(greatEqToken);
		tokens.add(greaterthanToken);
		tokens.add(ifToken);
		tokens.add(leftShiftToken);
		tokens.add(intToken);
		tokens.add(leftcurlyToken);
		tokens.add(leftroundToken);
		tokens.add(leftsqureToken);
		tokens.add(lessEqToken);
		tokens.add(lessthanToken);
		tokens.add(longToken);
		tokens.add(minusToken);
		tokens.add(modToken);
		tokens.add(multiCommentToken);
		tokens.add(bitWiseOrToken);
		tokens.add(singleCommentToken);
		// tokens.add(intLiteralToken);
		tokens.add(notEqualToken);
		tokens.add(newToken);
		tokens.add(notToken);
		tokens.add(orToken);
		tokens.add(plusToken);
		tokens.add(preprocessorToken);
		tokens.add(registerToken);
		tokens.add(returnToken);
		tokens.add(rightShiftToken);
		tokens.add(rightcurlyToken);
		tokens.add(rightroundToken);
		tokens.add(rightsqureToken);
		tokens.add(shortToken);
		tokens.add(signedToken);
		tokens.add(sizeOfToken);
		tokens.add(staticToken);
		tokens.add(structToken);
		tokens.add(switchToken);
		tokens.add(typedefToken);
		tokens.add(trueToken);
		tokens.add(unionToken);
		tokens.add(voidToken);
		tokens.add(volatileToken);
		tokens.add(whileToken);
		tokens.add(eofToken);
		tokens.add(stringLiteralToken);
		tokens.add(charLiteralToken);
		tokens.add(semiToken);
		tokens.add(idToken);
	}
}
