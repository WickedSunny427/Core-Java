package com.corejavaprojects.variable;

public class Contact {

	public static final String PREFIX = "+91";
	public int mobile = 987898899;

	public static void main(String[] args) {

		Contact contact = new Contact();

		System.out.println(Contact.PREFIX);
		System.out.println(contact.mobile);

	}

}