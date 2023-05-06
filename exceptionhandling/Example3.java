package com.corejavaprojects.exceptionhandling;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		Example3 obj = new Example3();
		System.out.println("===== EXCEPTION HANDLING  THROW AND THROWS  DEMO ========== \n");

		System.out.println("Enter 1st number  : ");
		int firstNumber = obj.getUserInput();

		System.out.println("Enter 2nd number  : ");
		int secondNumber = obj.getUserInput();

		System.out.println("Division using throw keyword demo : " + obj.divisionWithThrow(firstNumber, secondNumber));
		try {
			System.out.println(
					"Division using throws keyword demo : " + obj.divisionWithThrowsKeyword(firstNumber, secondNumber));
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

	private int divisionWithThrowsKeyword(int firstNumber, int secondNumber) throws ApplicationException {

		int result = 0;
		if (secondNumber == 0) {
			throw new ApplicationException("You are dividing by 0 !!!");
		} else {
			result = firstNumber / secondNumber;
		}
		return result;
	}

	private int divisionWithThrow(int firstNumber, int secondNumber) throws IllegalArgumentException {

		int result = 0;

		try {
			if (secondNumber == 0) {
				System.out.println("Found Exception Scenario, Denominator is 0 ...");
				throw new IllegalArgumentException();
			} else {
				result = firstNumber / secondNumber;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	private int getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}