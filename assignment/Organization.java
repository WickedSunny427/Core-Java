package com.corejavaprojects.assignment;

public class Organization {
	private int organizationCode;
	private String organizationName;
	private Employee employee;
	private Address address;

	public Organization(int organizationCode, String organizationName, int employeeId, String employeeName,
			String address1, String address2) {
		this.organizationCode = organizationCode;
		this.organizationName = organizationName;
		employee = new Employee(organizationCode, organizationName);
		address = new Address(address1, address2);
	}

	public void getOrganizationDetails() {

		employee.getEmployeeDetails();
		address.getAddressDetails();
		System.out.println("Organisation Code : " + organizationCode);
		System.out.println("Organisation Name : " + organizationName);
	}
}