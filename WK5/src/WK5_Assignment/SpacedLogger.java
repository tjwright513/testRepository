package WK5_Assignment;

import WK5_Assignment.WK5_Coding_Assignment.logger;

public class SpacedLogger implements logger, Logger {


	public void log(String userWord) {
		// TODO Auto-generated method stub
		char[] arr2 = new char[userWord.length()];
		for ( int i = 0; i < userWord.length(); i++ ) {
		    arr2[i] = userWord.charAt(i);
		}
		for ( int j = 0; j < arr2.length; j++ ) {
		    System.out.print(arr2[j] + " ");
		} 
		System.out.println ("");
	}


	public void error(String userWord) {
		// TODO Auto-generated method stub
		char[] arr = new char[userWord.length()];
		for ( int k = 0; k < userWord.length(); k++ ) {
		    arr[k] = userWord.charAt(k);
		}
		System.out.print("ERROR: ");
		for ( int l = 0; l < arr.length; l++ ) {
		    System.out.print(arr[l] + " ");
		}
	}

}
