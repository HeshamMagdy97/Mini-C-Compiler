package errors;

import java.util.ArrayList;
import java.util.Arrays;

import lexicalanalyzer.Token;

public class ErrorHandler {

	private String code;
	private ArrayList<Token> tokens;
	private ArrayList<String> errors;

	public ErrorHandler(String code, ArrayList<Token> tokens) {
		this.code = code.replaceAll(" ", "");
		this.tokens = tokens;
		this.errors = new ArrayList();
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
		ArrayList<String> codeList = new ArrayList<String>(Arrays.asList(code.split("")));
		ArrayList<String> compiledCodeList = new ArrayList<String>(Arrays.asList(compiledCode.split("")));
		
		String resultStr = "";
		//int loopSize = code.length() < compiledCode.length() ? code.length() : compiledCode.length();		
		for(int i=0; i<codeList.size(); i++) {
			if(!codeList.get(i).equals(compiledCodeList.get(i))) {
				resultStr += codeList.get(i);
				codeList.remove(i);
				i--;
			}else {
				if(!resultStr.equals("")) {
					errors.add(resultStr);
					resultStr = "";
				}
			}
		}	
		return errors;
	}
	
	public void printError() {
		this.checkErrors();
		if(this.errors.size()>0) {
			for(String error:errors) {
				System.err.println(error);
			}
		}
	}
}
