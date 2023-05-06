package com.corejavaprojects.java8.defaultandstatic;

public interface MyInterfaceTwo {
	default void greet() {
		System.out.println("I am default method of second Interface");
	}
	static void wish() {
		System.out.println("I am static method of second Interface");

	}
}
