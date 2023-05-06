package com.corejavaprojects.constructor;

public class Student {

	private int regNumber;
	private String name;

	public Student() {
		this.regNumber = 007;
		this.name = "James";
	}

	public Student(int regNumber, String name) {
		this.regNumber = regNumber;
		this.name = name;
	}

	public static void main(String[] args) {

		Student defaultStudent = new Student();// Default Constructor

		System.out.println(defaultStudent.regNumber);
		System.out.println(defaultStudent.name);

		Student student = new Student(101, "Sunny");// Parameterized Constructor

		System.out.println(student.regNumber);
		System.out.println(student.name);

	}

}