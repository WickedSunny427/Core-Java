package com.corejavaprojects.loops;

import java.util.Scanner;

public class DoWhileLoopDemo {

	public static void main(String[] args) {

		int input;

		DoWhileLoopDemo obj = new DoWhileLoopDemo();

		System.out.println("Enter starting value : ");
		input = obj.getUserInput();
		obj.displayAscending(input);
	}

	private int getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private void displayAscending(int input) {
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= input);
	}
}