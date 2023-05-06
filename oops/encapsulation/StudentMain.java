package com.corejavaprojects.oops.encapsulation;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Student student = new Student();

		StudentMain obj = new StudentMain();

		System.out.println("------ Enter Student's Details -----");
		obj.setStudentDetails(student);

		System.out.println("---------- Printing Students Details --------------");
		obj.getStudentDetails(student);
	}

	private void setStudentDetails(Student student) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Registration Number :");
		student.setRegNumber((sc.nextInt()));

		System.out.println("Enter Name :");
		student.setName(sc.next());

		System.out.println("Enter College Name :");
		student.setCollege(sc.next());

		System.out.println("Enter Branch Name :");
		student.setBranch(sc.next());

		System.out.println("Enter DOJ :");
		student.setDoj(sc.next());

		System.out.println("Data Added Successfully ..." + "\n");
		sc.close();
	}

	public void getStudentDetails(Student student) {
		System.out.println("Registration Number : " + student.getRegNumber());
		System.out.println("Name : " + student.getName());
		System.out.println("College : " + student.getCollege());
		System.out.println("Branch : " + student.getBranch());
		System.out.println("Date of Joining : " + student.getDoj());
	}
}