package com.corejavaprojects.constructor;

public class Address {

	private static final int PINCODE = 560100;
	private String landmark;
	private String area;

	public Address() {

		this.landmark = "Near Bakery";
		this.area = "Electronic City";
	}

	public Address(String landmark, String area) {
		this.landmark = landmark;
		this.area = area;
	}

	public static void main(String[] args) {

		Address address = new Address();

		System.out.println(Address.PINCODE);
		System.out.println(address.area);
		System.out.println(address.landmark);

		Address address1 = new Address("Clinic", "Kormangla");

		System.out.println(address1.area);
		System.out.println(address1.landmark);

	}

}