package com.corejavaprojects.loops;

import java.util.Scanner;

public class PatternNumbers {

	public static void main(String[] args) {
		int input;

		PatternNumbers obj = new PatternNumbers();

		System.out.println("Enter starting value : ");
		input = obj.getUserInput();

		System.out.println("---------- Displaying Pattern - 1 ---------");
		obj.displayPattern1(input);
		System.out.println();

		System.out.println("---------- Displaying Pattern - 2 ---------");
		obj.displayPattern2(input);
		System.out.println();

		System.out.println("---------- Displaying Pattern - 3 ---------");
		obj.displayPattern3(input);
		System.out.println();
	}

	private void displayPattern1(int input) {
		int end = input;
		for (int i = 1; i <= end; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	private void displayPattern2(int input) {
		int end = input;
		for (int i = 1; i <= end; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}


	private void displayPattern3(int input) {
		int end = input;
		for (int i = end; i>= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	private int getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

}
