package com.corejavaprojects.java8.lamdaexpressions;

public class FunctionalInterfaceWithoutAnnotationMain {

	public static void main(String[] args) {
		FunctionalInterfaceWithoutAnnotation lamda = (num1, num2) -> {
			return num1 * num2;
		};
		double product = lamda.product(87.45, 78.5);
		System.out.println(product);
	}

}
