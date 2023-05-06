package com.corejavaprojects.assignment;

public class Address {
	private String address1;
	private String address2;

	public Address(String address1, String address2) {
		this.address1 = address1;
		this.address2 = address2;
	}

	public void getAddressDetails() {
		System.out.println("Addrees Line 1 : " + address1);
		System.out.println("Addrees Line 2 : " + address2);
	}
}