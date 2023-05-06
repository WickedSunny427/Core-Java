package com.corejavaprojects.oops.polymorphism;

public class Dog implements Animal {

	@Override
	public void move() {
		System.out.println("Dog walks... ");
	}
}