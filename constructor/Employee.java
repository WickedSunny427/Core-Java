package com.corejavaprojects.constructor;

public class Employee {

	private static final String DOB = "TCS";
	private int employeeId;
	private String name;

	public Employee() {

		this.employeeId = 001;
		this.name = "Robot";
	}

	public Employee(int employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}

	public static void main(String[] args) {

		Employee employeeDefault = new Employee();

		System.out.println(Employee.DOB);
		System.out.println(employeeDefault.employeeId);
		System.out.println(employeeDefault.name);

		Employee employee = new Employee(457, "Sam");
		System.out.println(employee.employeeId);
		System.out.println(employee.name);

	}

}