package com.corejavaprojects.oops.polymorphism.assignment;

public class Sbi implements Bank {

	@Override
	public void fdInterestRate() {
		System.out.println("SBI Bank  gives  4% annually.");
	}
}