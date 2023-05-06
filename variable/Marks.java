package com.corejavaprojects.variable;

public class Marks {

	// Initializing static variable.
	public static String SCHOOL_NAME = "DAV";

	// Initializing non static variables.
	public int marks1 = 95;
	public int marks2 = 77;
	public int marks3 = 86;

	public static void main(String[] args) {

		// Invoking static variable
		System.out.println(Marks.SCHOOL_NAME);

		// Creating object of this class.
		Marks mark = new Marks();

		// Invoking non static variables
		System.out.println(mark.marks1);
		System.out.println(mark.marks2);
		System.out.println(mark.marks3);
	}

}