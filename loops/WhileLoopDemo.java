package com.corejavaprojects.loops;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {

		int input;

		WhileLoopDemo obj = new WhileLoopDemo();

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
		while (i <= input) {
			System.out.print(i + " ");
			i++;
		}
	}
}