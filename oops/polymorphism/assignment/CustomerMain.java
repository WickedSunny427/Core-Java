package com.corejavaprojects.oops.polymorphism.assignment;

public class CustomerMain {

	public static void main(String[] args) {
		Bank axis = new AxisBank();
		Bank canara = new CanaraBank();
		Bank sbi = new Sbi();

		ICustomer customer = new Customer();
		customer.opensAccount(sbi);
		customer.opensAccount(axis);
		customer.opensAccount(canara);
	}
}