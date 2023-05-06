package com.corejavaprojects.collections.map;

public class Employee {
	private int empId;
	private String name;
	private String organization;
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public String getOrganization() {
		return organization;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", organization=" + organization + "]";
	}



}
