package com.corejavaprojects.assignment.bank;

public class Transaction {
	private float balance;
	private float deposit1;
	private float withdrawal1;
	private float deposit2;
	private float withdrawal2;

	public Transaction(float balance, float deposit1, float withdrawal1, float deposit2, float withdrawal2) {
		this.balance = balance;
		this.deposit1 = deposit1;
		this.withdrawal1 = withdrawal1;
		this.deposit2 = deposit2;
		this.withdrawal2 = withdrawal2;
	}

	public void getTransactionDetails() {
		System.out.println("Initial Balance : " + balance);
		System.out.println("Deposited on Day 1 : " + deposit1);
		System.out.println("Witdrawal on Day 2 : " + withdrawal1);
		System.out.println("Deposited on Day 3 : " + deposit2);
		System.out.println("Witdrawal on Day 2 : " + withdrawal2);

		float remaining = balance + deposit1 - withdrawal1 + deposit2 - withdrawal2;
		System.out.println("Available Balance : " + remaining);
	}
}
