package com.corejavaprojects.java8.stream.assignment;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamStudentAggregateMain {
	public static void main(String[] args) {
		List<Student> students = List.of(new Student("SUNNY", 85.0, 123), new Student("RITESH", 92.0, 234),
				new Student("REGU", 76.5, 345), new Student("DHONI", 88.0, 456), new Student("SACHIN", 91.5, 567),
				new Student("SARAVAN", 81.0, 678), new Student("REGU", 95.0, 789), new Student("SHEHWAG", 87.5, 890),
				new Student("REGU", 83.0, 901), new Student("WARNE", 90.0, 912));

		List<String> idStrings = students.stream().map(student -> Integer.toString(student.getId()))
				.collect(Collectors.toList());

		System.out.println("Id's as String...");
		System.out.println(idStrings);

		List<String> lowercaseNames = students.stream()
				.map(student -> Character.toLowerCase(student.getName().charAt(0)) + student.getName().substring(1))
				.collect(Collectors.toList());

		System.out.println("\nStudent names with first letter lowercase:");
		System.out.println(lowercaseNames);

		System.out.println("\nDuplicate students with name REGU:");
		List<Student> duplicateStudents = students.stream().filter(student -> student.getName().equals("REGU"))
				.collect(Collectors.toList());
		System.out.println(duplicateStudents.toString());

		Optional<Student> reguStudent = students.stream().filter(student -> student.getName().equals("REGU"))
				.findFirst();

		if (reguStudent.isPresent()) {
			Student firstReguStudent = reguStudent.get();
			System.out.println("\nFirst student with name REGU: " + firstReguStudent.toString());
		} else {
			System.out.println("No student with name REGU found.");
		}

		Optional<Double> mark = students.stream().filter(student -> student.getId() == 123).map(Student::getScore)
				.findFirst();

		if (mark.isPresent()) {
			System.out.println("\nMark of student with ID 123: " + mark.get());
		} else {
			System.out.println("No student with ID 123 found.");
		}

		List<String> idAndNames = students.stream().map(student -> student.getId() + " " + student.getName())
				.collect(Collectors.toList());

		System.out.println("\nStudent Id and Names:");
		System.out.println(idAndNames);

		List<String> idToString = students.stream().map(student -> String.valueOf(student.getId()))
				.collect(Collectors.toList());
		System.out.println("\nConverting ID to String");
		System.out.println(idToString);

		List<Student> newStudents = students.stream().map(student -> new Student(student.getName(), student.getId()))
				.collect(Collectors.toList());

		System.out.println("\nNew list of students with only id and name:");
		System.out.println(newStudents);

		List<Marks> marksList = List.of(new Marks(1), new Marks(2), new Marks(3), new Marks(4), new Marks(5),
				new Marks(6), new Marks(7), new Marks(8), new Marks(9), new Marks(10));

		List<Integer> totals = marksList.stream().map(m -> m.getMarks1() + m.getMarks2() + m.getMarks3())
				.collect(Collectors.toList());

		//List<Marks>
		System.out.println("\nTotal marks for all students:");
		System.out.println(totals);

		
	}
}