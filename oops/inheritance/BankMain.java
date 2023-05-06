package com.corejavaprojects.oops.inheritance;

public class BankMain {

	public static void main(String[] args) {

		Hdfc hdfc = new Hdfc("4%");

		hdfc.fdRate = 3.5;	// Initializing parent class instance variable.
		hdfc.fdRate(); 			// Invoking child class method.
		hdfc.rules();				//Invoking Parent class method.
	}
}