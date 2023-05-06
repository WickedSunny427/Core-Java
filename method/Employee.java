package com.corejavaprojects.method;

public class Employee {

	private static int SALARY = 22145;
	private int empId;
	private String bloodGroup;

	public Employee() {
		this.empId = 007;
		this.bloodGroup = "Blood Less";
	}

	public Employee(int empId, String bloodGroup) {
		this.empId = empId;
		this.bloodGroup = bloodGroup;
	}

	public static int getSalary() {
		return Employee.SALARY;
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee employee1 = new Employee(999, "B+ve");

		System.out.println(Employee.getSalary());
		System.out.println(employee.empId);
		System.out.println(employee.bloodGroup);

		System.out.println(employee1.empId);
		System.out.println(employee1.bloodGroup);

	}

}