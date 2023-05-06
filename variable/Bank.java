package com.corejavaprojects.variable;

public class Bank {

	public final static String BANK_NAME = "HDFC BANK";
	public final static String IFSC_CODE = "HDFC0000077";
	public String branch = "Bangalore - It Park";

	public static void main(String[] args) {

		Bank bank = new Bank();

		System.out.println(Bank.BANK_NAME);
		System.out.println(Bank.IFSC_CODE);
		System.out.println(bank.branch);
	}
}