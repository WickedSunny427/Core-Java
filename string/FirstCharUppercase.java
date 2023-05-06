package com.corejavaprojects.string;

import java.util.Scanner;

public class FirstCharUppercase {

	public static void main(String[] args) {
		FirstCharUppercase obj = new FirstCharUppercase();

		System.out.println("===== FIRST and LAST CHARACTER UPPERCASE PROGRAM  ========== \n");

		System.out.println("Enter string to below : ");
		String input = obj.getUserInput();

		System.out.println("Original String : " + input + "\n");
		System.out.println("First Character  Uppercase :  " + obj.firstCharUppercase(input));
		System.out.println("Last Character  Uppercase : " + obj.lastCharUppercase(input));
	}

	private String lastCharUppercase(String input) {

		char last = input.charAt(input.length() - 1);
		String lastLetter = String.valueOf(last).toUpperCase();
		String remainingLetters = input.substring(0, input.length() - 1);

		return input = remainingLetters + lastLetter;
	}

	private String firstCharUppercase(String input) {

		String firstLetter = input.substring(0, 1).toUpperCase();
		String remainingLetters = input.substring(1, input.length());

		return input = firstLetter + remainingLetters;
	}

	private String getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
}