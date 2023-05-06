package com.corejavaprojects.java8.lamdaexpressions;

public class LamdaConcatationMain {

	public static void main(String[] args) {
		Concatation con = (data1, data2) -> {
			String result = data1 + data2;
			System.out.println("Result after concatation using Lamda Expression : " + result);
		};

		con.concat("Hello", "Lamda");
	}
}