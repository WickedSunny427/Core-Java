package com.corejavaprojects.string;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String input;

		StringReverse obj = new StringReverse();
		System.out.println("===== REVERSE STRING PROGRAM  ========== \n");
		System.out.println("Enter string to be reversed below : ");
		input = obj.getUserInput();
		System.out.println("Original String : " + input + "\n");
		System.out.println("Reversed Sring :  " + obj.reverseString(input));
		System.out.println(
				"Reversed Sring with special characters retained:  " + obj.reverseStringWithSpecialCharacters(input));
	}

	private String reverseString(String input) {
		char charArray[] = input.toCharArray();

		int start = 0;
		int end = input.length() - 1;

		while (start < end) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			start++;
			end--;
		}
		return new String(charArray);
	}

	private String reverseStringWithSpecialCharacters(String input) {

		char charArray[] = input.toCharArray();

		int start = 0;
		int end = input.length() - 1;

		while (start < end) {
			if (!Character.isAlphabetic(charArray[start]) || Character.isWhitespace(charArray[start])) {
				start++;
			} else if (!Character.isAlphabetic(charArray[end]) || Character.isWhitespace(charArray[start])) {
				end--;
			} else {
				char temp = charArray[start];
				charArray[start] = charArray[end];
				charArray[end] = temp;
				start++;
				end--;
			}
		}
		return new String(charArray);
	}

	private String getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

}
