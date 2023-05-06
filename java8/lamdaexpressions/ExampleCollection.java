package com.corejavaprojects.java8.lamdaexpressions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ExampleCollection {

	public static void main(String[] args) {

		List<String> students = new LinkedList<>();
		students.add("Student is : " + "Swagata");
		students.add("Student is : " + "Sunita");
		students.add("Student is : " + "Sunny");

		System.out.println("Printing List using Lamda ...");
		students.forEach(student -> System.out.println(student));

		Map<String, Long> trainers = new HashMap<>();
		trainers.put("Regu", 974514561l);
		trainers.put("Reno", 8479204554l);
		trainers.put("Ritesh", 70451554l);
		System.out.println("\nPrinting Map using Lamda ...");

		trainers.forEach((trainer, number) -> {
			System.out.println("Trainer name : " + trainer);
			System.out.println("Contact : " + number);
		});
	}

}
