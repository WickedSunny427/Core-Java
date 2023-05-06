package com.corejavaprojects.oops.abstractdemo;

public abstract class Bank {
	public Bank() {
		System.out.println("Default Abstract Constructor...");
	}

	public Bank(String name) {
		System.out.println("Parametrized Abstract Constructor..." + name);
	}

	abstract int getRateOfInterest();

	public void getNonStaticMethod() {
		System.out.println("Calling non Static Method of the abstract class...");
	}
	public static void getStaticMethod() {
		System.out.println("Calling Static Method of the abstract class...");
	}
}
