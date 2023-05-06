package com.corejavaprojects.method;

public class EmployeeDetails {

	public void getEmployeeName() {
		System.out.println("Sunny");
	}

	public String employeeId() {
		return "#223183";
	}

	public static void main(String[] args) {

		EmployeeDetails empDetails = new EmployeeDetails();
		empDetails.getEmployeeName();
		String id = empDetails.employeeId();
		System.out.println(id);
	}

}