package com.corejavaprojects.primitivedatatype;

public class Student {
	private int studentId;
	private String studentName;
	private Mark mark;

	public Student(int studentId, String studentName, int mark1, int mark2) {
		this.studentId = studentId;
		this.studentName = studentName;
		mark = new Mark(mark1, mark2);
	}

	public void getStudentDetails() {
		System.out.println("Student ID : " + studentId);
		System.out.println("Student Name : " + studentName);
		mark.getMarkDetails();
	}
}