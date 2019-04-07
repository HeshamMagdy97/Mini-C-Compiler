package errors;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.tools.javac.util.StringUtils;

import lexicalanalyzer.Token;

public class ErrorHandler {

	private String code;
	private ArrayList<Token> tokens;

	public ErrorHandler(String code, ArrayList<Token> tokens) {
		this.code = code.replaceAll(" ", "");
		this.tokens = tokens;
	}

	private String listToString() {
		String comiledCode = "";
		for (Token t : tokens) {
			comiledCode += t.getValue();
		}
		return comiledCode;
	}
	
	public ArrayList<String> checkErrors() {
		String compiledCode = this.listToString();
		ArrayList<String> result = new ArrayList();
		ArrayList<String> codeList = new ArrayList<String>(Arrays.asList(code.split("")));
		ArrayList<String> compiledCodeList = new ArrayList<String>(Arrays.asList(compiledCode.split("")));
		
		/*if(compiledCode.equals(compiledCode))
			return null;*/
		String resultStr = "";
		int loopSize = code.length() > compiledCode.length() ? code.length() : compiledCode.length();
		for(int i=0; i<loopSize; i++) {
			if(!codeList.get(i).equals(compiledCodeList.get(i))) {
				resultStr += codeList.get(i);
				codeList.remove(i);
				i--;
				
			}else {
				if(!resultStr.equals("")) {
					result.add(resultStr);
					resultStr = "";
				}
			}
		}	
		return result;
	}
	
	public static String difference(String str1, String str2) {
	    if (str1 == null) {
	        return str2;
	    }
	    if (str2 == null) {
	        return str1;
	    }
	    int at = indexOfDifference(str1, str2);
	    if (at == -1) {
	        return null;
	    }
	 return str2.substring(at);
	}
	public static int indexOfDifference(String str1, String str2) {
	    if (str1 == str2) {
	        return -1;
	    }
	    if (str1 == null || str2 == null) {
	        return 0;
	    }
	    int i;
	    for (i = 0; i < str1.length() && i < str2.length(); ++i) {
	        if (str1.charAt(i) != str2.charAt(i)) {
	            break;
	        }
	    }
	    if (i < str2.length() || i < str1.length()) {
	        return i;
	    }
	    return -1;
	}

}
