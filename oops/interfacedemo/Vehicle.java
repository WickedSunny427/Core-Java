package com.corejavaprojects.oops.interfacedemo;

public interface Vehicle {

	public void engine();

	public default void Drivers() {
		System.out.println("Diplaying Drivers Details ...");
	}

	public static void battery() {
		System.out.println("Displaying Battery Details ...");
	}
}