package com.corejavaprojects.loops;

import java.util.Scanner;

public class DescendingDemo {

	public static void main(String[] args) {

		int input;
		DescendingDemo obj = new DescendingDemo();

		System.out.println("Enter starting value : ");
		input = obj.getUserInput();
		obj.displayDescending(input);

	}

	private int getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private void displayDescending(int input) {
		for (int i = input; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
}