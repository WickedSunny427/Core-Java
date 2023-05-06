package com.corejavaprojects.method;

public class Student {

	private static String NATIONALITY = "INDIA";
	private String regNo;
	private String name;

	public Student() {
		this.regNo = "001";
		this.name = "Dummy";
	}

	public Student(String regNo, String name) {
		this.regNo = regNo;
		this.name = name;
	}

	public static String getNationality() {
		return Student.NATIONALITY;
	}

	public static void main(String[] args) {
		Student student = new Student();
		Student student1 = new Student("324543", "Sunny");

		System.out.println(Student.getNationality());
		System.out.println(student.name);
		System.out.println(student.regNo);

		System.out.println(student1.name);
		System.out.println(student1.regNo);
	}

}