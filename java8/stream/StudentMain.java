package com.corejavaprojects.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StudentMain {

	public static void main(String[] args) {

		List<Student> studentsList = new ArrayList<>();

		studentsList.add(new Student("Dhoni", 97.74));
		studentsList.add(new Student("Virat", 40.50));
		studentsList.add(new Student("Rishabh", 87.35));
		studentsList.add(new Student("Bhuvi", 55.15));
		studentsList.add(new Student("Bumrah", 99.99));
		studentsList.add(new Student("Zaheer", 87.12));
		studentsList.add(new Student("Pathan", 35.12));
		studentsList.add(new Student("Harbhajan", 84.86));
		studentsList.add(new Student("Balaji", 75.12));

		List<Student> goodBatsman = studentsList.stream().filter(student -> student.getMarks() >= 60)
				.collect(Collectors.toList());

		System.out.println("Filtering using Stream and Intermediate filter functions.\n");
		for (Student goodPlayer : goodBatsman) {
			System.out.println(goodPlayer);
		}

		System.out.println("\nPrinting using Stream and :: Operator\n");
		goodBatsman.stream().forEach(System.out::println);

		System.out.println(
				"\nSum of all the marks : " + studentsList.stream().mapToDouble(student -> student.getMarks()).sum());

		System.out.println("\nCount : " + studentsList.stream().count());

		OptionalDouble od = studentsList.stream().mapToDouble(student -> student.getMarks()).average();
		if (od.isPresent()) {
			System.out.println("\nAverage using OptionalDouble and Intermediate Function : " + od.getAsDouble());

		}

		List<Student> customList = studentsList.stream().filter(student -> student.getName().startsWith("B")).parallel()
				.sorted().collect(Collectors.toList());
		System.out.println("\nMix and Match");
		customList.forEach(System.out::println);
	}

}
