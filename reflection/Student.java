package com.corejavaprojects.reflection;

public class Student {
	private String privateName;
	public String publicState;

	public Student() {
		this.privateName = "Sachin";
	}

	public Student(String privateName) {
		this.privateName = privateName;
	}

	private void privateNonParametrizedMethod() {
		System.out.println("I am Private Non-Parametriszed method !!!");
	}

	private void privateParametrizedMethod(String publicState) {
		System.out.println("I am Private Non-Parametrized method !!! My value is : " + publicState);
	}

	public void publicNonParametrizedMethod() {
		System.out.println("I am Public Non-Parametrized method !!! ");
	}

	public void publicParametrizedMethod(String publicState) {
		System.out.println("I am Public Parametrized method !!! My value is : " + publicState);
	}
}