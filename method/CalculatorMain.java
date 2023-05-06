package com.corejavaprojects.method;

public class CalculatorMain {

	public void add(int firstNumber, int secondNumber) {
		int result = firstNumber + secondNumber;
		System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is " + result);
	}

	public void subtract(int firstNumber, int secondNumber) {
		int result = firstNumber - secondNumber;
		System.out.println("Difference of " + firstNumber + " and " + secondNumber + " is " + result);
	}

	public void multiply(int firstNumber, int secondNumber) {
		int result = firstNumber * secondNumber;
		System.out.println("Product of " + firstNumber + " and " + secondNumber + " is " + result);
	}

	public void divide(int firstNumber, int secondNumber) {
		int result = firstNumber + secondNumber;
		System.out.println("Division of " + firstNumber + " and " + secondNumber + " is " + result);
	}

	public static void main(String[] args) {

		CalculatorMain calculator = new CalculatorMain();
		calculator.add(20, 10);
		calculator.subtract(20, 10);
		calculator.multiply(20, 10);
		calculator.divide(20, 10);
	}

}
