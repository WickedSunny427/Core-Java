package com.corejavaprojects.variable;

public class Address {

	public static final int PINCODE = 560100;
	public String landmark = "Near Bakery";

	public static void main(String[] args) {

		Address address = new Address();

		System.out.println(Address.PINCODE);
		System.out.println(address.landmark);
	}

}