package WK5_Assignment;

import WK5_Assignment.WK5_Coding_Assignment.logger;

public class AstrickLogger implements logger, Logger {

	public void log (String userWord) {
		System.out.println ("***" + userWord + "***");
	}
	
	public void error (String userWord) {
		StringBuilder astricLine = new StringBuilder();
		int totalline = 10 + userWord.length() + 3;
		for (int i = 0; i < totalline; i++) {
			astricLine.append("*");
		}
		System.out.println(astricLine);
		System.out.println("***Error: " + userWord + "***");
		System.out.println(astricLine);
		}
}
