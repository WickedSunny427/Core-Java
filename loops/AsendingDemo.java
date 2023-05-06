package com.corejavaprojects.loops;

import java.util.Scanner;

public class AsendingDemo {

	public static void main(String[] args) {

		int input;
		AsendingDemo obj = new AsendingDemo();

		System.out.println("Enter starting value : ");
		input = obj.getUserInput();
		obj.displayAscending(input);
	}

	private int getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private void displayAscending(int input) {
		for (int i = 1; i <= input; i++) {
			System.out.print(i + " ");
		}
	}
}