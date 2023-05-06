package com.corejavaprojects.oops.polymorphism.assignment;

public class AxisBank implements Bank {
	double fdRate;

	@Override
	public void fdInterestRate() {
		System.out.println("Axis Bank  gives  5% annually.");
	}
}