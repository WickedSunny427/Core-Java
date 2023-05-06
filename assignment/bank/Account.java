package com.corejavaprojects.assignment.bank;

public class Account {

	private int accountNumber;
	private String accountType;

	private Bank bank;
	private Transaction transaction;

	public Account(int accountNumber) {
		bank = new Bank("HDFC", "HDFC00101", "Electronic City");
		transaction = new Transaction(50470, 25400, 10000, 40000, 30000);
		this.accountNumber = accountNumber;
		accountType = "Savings";
	}

	public void getAllCustomerDetails() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Type : " + accountType);
		bank.getBankDetails();
		transaction.getTransactionDetails();
	}

}
