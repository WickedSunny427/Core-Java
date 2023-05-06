package com.corejavaprojects.java8.lamdaexpressions;

public class MyFunctionalMain {

	public static void main(String[] args) {

		MyFunctionalInterface lambda = () -> {

			System.out.println("Lamda running");
			System.out.println("Performing some operations... ");
		};

		lambda.execute();;
	}

}
