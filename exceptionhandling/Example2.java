package com.corejavaprojects.exceptionhandling;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		Example2 obj = new Example2();
		System.out.println("===== EXCEPTION HANDLING  HIERARCHY  DEMO ========== \n");

		System.out.println("Enter 1st number  : ");
		int firstNumber = obj.getUserInput();

		System.out.println("Enter 2nd number  : ");
		int secondNumber = obj.getUserInput();

		System.out.println("Division when Exception handled : " + obj.divisionWithHierarchy(firstNumber, secondNumber));
	}

	private int divisionWithHierarchy(int firstNumber, int secondNumber) {

		int result = 0;

		try {
			result = firstNumber / secondNumber;
			String s = null;
			System.out.println(s.toLowerCase()); // CREATING NULL POINTER EXCEPTION
		} catch (ArithmeticException e) {
			System.out.println("Found Arithmatic Exception Scenario, Handled with Sub Class ...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Found Exception Scenario, Handled with Parent Class ...");
			e.printStackTrace();
		} finally {
			System.out.println("Finally Executed ...");
		}
		return result;
	}

	private int getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}