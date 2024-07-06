package WK5_Assignment;

import java.util.Scanner;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a word, please: ");
		System.out.println(" ");
		Scanner in = new Scanner(System.in);
		String userWord;
		userWord = in.nextLine();
		
	
		if (userWord.length() >5) {
			System.out.println ("***" + userWord + "***");
		}else {
		StringBuilder astricLine = new StringBuilder();
		int totalline = 10 + userWord.length() + 3;
		for (int i = 0; i < totalline; i++) {
			astricLine.append("*");
		}
		System.out.println(astricLine);
		System.out.println("***Error: " + userWord + "***");
		System.out.println(astricLine);
		}
		
		
		
		if (userWord.length() >5) {
		char[] arr2 = new char[userWord.length()];
		for ( int i = 0; i < userWord.length(); i++ ) {
		    arr2[i] = userWord.charAt(i);
		}
		for ( int j = 0; j < arr2.length; j++ ) {
		    System.out.print(arr2[j] + " ");
		}
		}else {
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
	
	
	
	
}