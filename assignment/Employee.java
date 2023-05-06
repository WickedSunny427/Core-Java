package com.corejavaprojects.assignment;

public class Employee {
	private int employeeId;
	private String employeeName;

	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public void getEmployeeDetails() {
		System.out.println("Employee ID : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
	}
}