package com.corejavaprojects.assignment.bank;

public class Bank {
	private String bankName;
	private String ifscCode;
	private String branch;

	public Bank(String bankName, String ifscCode, String branch) {
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.branch = branch;
	}

	public void getBankDetails() {
		System.out.println("Bank Name :" + bankName);
		System.out.println("IFSC Code :" + ifscCode);
		System.out.println("Branch :" + branch);
	}

}