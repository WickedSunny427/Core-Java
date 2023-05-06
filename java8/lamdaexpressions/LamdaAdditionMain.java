package com.corejavaprojects.java8.lamdaexpressions;

public class LamdaAdditionMain {

	public static void main(String[] args) {

		Addition addition = (first, second, third) -> first + second + third;

		System.out.println("Sum is : " + addition.add(45.12, 78.45, 98.36));
	}
}