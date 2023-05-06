package com.corejavaprojects.java8.defaultandstatic;

public class MyClass implements MyInterfaceOne,MyInterfaceTwo{

	@Override
	public void greet() {

		System.out.println("Greeting from Implemented class and calling the super now ...");
		MyInterfaceOne.super.greet();
		//MyInterfaceTwo.super.greet();
		MyInterfaceOne.wish();
		MyInterfaceTwo.wish();
	}
	
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.greet();
	}
}
