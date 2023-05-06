package com.corejavaprojects.string;

import java.util.Scanner;

public class DelimeterReverse {

	public static void main(String[] args) {
		DelimeterReverse obj = new DelimeterReverse();

		System.out.println("===== DELIMETR REVERSE PROGRAM  ========== \n");

		System.out.println("Enter string to below : ");
		String input = obj.getUserInput();

		System.out.println("\nOriginal String : " + input);
		System.out.println("After Conditional Reversal :  " + obj.reverseOnDelimeter(input));
	}

	private String reverseOnDelimeter(String input) {

		String tokenOriginal[] = input.split(";");
		String firstToken, secondToken;

		firstToken = tokenOriginal[0];
		secondToken = tokenOriginal[1];

		char markerCharacter = secondToken.charAt(1);
		int markerIndex = Character.getNumericValue(markerCharacter);
		String temp = firstToken.substring(0, markerIndex + 4);
		StringBuffer buffer = new StringBuffer(temp);

		String firstHalf = buffer.reverse().toString();
		String secondHalf = input.substring(markerIndex + 5, input.length());

		return firstHalf + "," + secondHalf;
	}

	private String getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}