package com.corejavaprojects.collections.list.sort.comparator.java8;

public class Account {
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

}