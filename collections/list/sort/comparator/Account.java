package com.corejavaprojects.collections.list.sort.comparator;

import java.util.Comparator;

public class Account implements Comparator<Account> {
	private int id;
	private String name;
	private String organization;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOrganization() {
		return organization;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", organization=" + organization + "]";
	}

	@Override
	public int compare(Account account1, Account account2) {
		return account2.getId() - account1.getId();
	}
}