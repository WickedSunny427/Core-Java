package com.corejavaprojects.java8.stream;

public class Student implements Comparable<Student> {
	private String name;
	private double marks;

	public Student(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student student) {
		return (int) (this.marks - student.getMarks());
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
}
