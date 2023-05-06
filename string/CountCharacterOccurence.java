package com.corejavaprojects.string;

import java.util.Scanner;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		CountCharacterOccurence obj = new CountCharacterOccurence();
		System.out.println("===== COUNT CHARACTER OCCURENCE IN A STRING PROGRAM  ========== \n");

		System.out.println("Enter string to below : ");
		String input = obj.getUserInput();

		System.out.println("Original String : " + input + "\n");
		obj.countCharacterOccurence(input);
	}

	private void countCharacterOccurence(String input) {

		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			count = 0;
			char chout = input.charAt(i);

			for (int j = 0; j < input.length(); j++) {
				char chin = input.charAt(j);
				
			if (j<i && chin==chout) {
				break;
			}
				
				if (chout == chin) {
					count++;
				}
			}
			if (count!=0) {
				System.out.println("The character " + chout + " occurs " + count + " times.");
				
			}
		}
	}

	private String getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}