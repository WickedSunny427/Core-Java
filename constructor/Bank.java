package com.corejavaprojects.constructor;

public class Bank {

	private static final String BANK_NAME = "HDFC BANK";
	private String IFSC_CODE;
	private String branch;

	public Bank(String iFSC_CODE, String branch) {
		IFSC_CODE = iFSC_CODE;
		this.branch = branch;
	}

	public static void main(String[] args) {

		Bank bank1 = new Bank("HDFC10045IN", "ELECTONIC CITY");
		Bank bank2 = new Bank("HDFC17785IN", "MARATHALLI");

		System.out.println(Bank.BANK_NAME);
		System.out.println(bank1.IFSC_CODE);
		System.out.println(bank1.branch);

		System.out.println(Bank.BANK_NAME);
		System.out.println(bank2.IFSC_CODE);
		System.out.println(bank2.branch);
	}
}