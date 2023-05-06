package com.corejavaprojects.java8.defaultandstatic;

public interface MyInterfaceOne {
	default void greet() {
		System.out.println("I am default method of first Interface");
	}
	static void wish() {
		System.out.println("I am static method of first Interface");

	}

}
