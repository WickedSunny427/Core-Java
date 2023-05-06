package com.corejavaprojects.autoboxing;

public class Calculator {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		Integer input1 = 20;
		Integer input2 = 30;
		int input3 = 50;
		int input4 = 25;

		int sum = calculator.add(input1, input2);
		int difference = calculator.difference(input3, input4);

		System.out.println("Sum of " + input1 + " and " + input2 + " is " + sum);
		System.out.println("Difference of " + input3 + " and " + input4 + " is " + difference);
	}

	public int add(int input1, int input2) {
		return input1 + input2;
	}

	public Integer difference(Integer input3, Integer input4) {
		return input3 - input4;
	}
}