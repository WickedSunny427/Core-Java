package com.corejavaprojects.jdbc;

public class Student {
	private int reg;
	private String name;
	private String branch;
	private String email;
	private String contact;

	public int getReg() {
		return reg;
	}

	public String getName() {
		return name;
	}

	public String getBranch() {
		return branch;
	}

	public String getEmail() {
		return email;
	}

	public String getContact() {
		return contact;
	}

	public void setReg(int reg) {
		this.reg = reg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}