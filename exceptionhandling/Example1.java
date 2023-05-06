package com.corejavaprojects.exceptionhandling;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Example1 obj = new Example1();
		System.out.println("===== EXCEPTION HANDLING  PROGRAM  DEMO ========== \n");

		System.out.println("Enter 1st number  : ");
		int firstNumber = obj.getUserInput();

		System.out.println("Enter 2nd number  : ");
		int secondNumber = obj.getUserInput();

		// System.out.println("Division without Exception handled : "
		// + obj.divisionWithoutExpectionHandling(firstNumber, secondNumber));

		System.out.println(
				"Division when Exception handled : " + obj.divisionWithExpectionHandling(firstNumber, secondNumber));
	}

	private int divisionWithExpectionHandling(int firstNumber, int secondNumber) {
		int result = 0;
		try {
			result = firstNumber / secondNumber;
		} catch (Exception e) {
			System.out.println("Division by zero not allowed !!!!");
		} finally {
			System.out.println("Finally Executed ...");
		}
		return result;

	}

	private int divisionWithoutExpectionHandling(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
	}

	private int getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
