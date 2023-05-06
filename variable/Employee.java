package com.corejavaprojects.variable;

/**
 * Variable Example
 *
 */
public class Employee {

	// static variable
	public static String ORG_NAME = "TCS";

	// Constant variable
	public static final String ORG_NAME_BRANCH = "BANGALORE";

	public static void main(String[] args) {

		// invoke the static variable.
		System.out.println(Employee.ORG_NAME);

		/**
		 * Cannot change the value of a final variable. 
		 * Employee.ORG_NAME_BRANCH="ABC";
		 */

		// invoke the static variable.
		System.out.println(Employee.ORG_NAME_BRANCH);

	}

}
