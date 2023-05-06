package com.corejavaprojects.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemoMain {

	public static void main(String[] args) {

		ArrayListDemoMain object = new ArrayListDemoMain();

		System.out.println("Add elements to ArrayList... \n");
		List<String> students = object.addElementsArrayList("Sunny", "Anusha", "Sravan", "Ritesh", "Sunny");

		System.out.println("Get elements from ArrayList...\n");
		object.getElementsArrayList(students);
	}

	private void getElementsArrayList(List<String> students) {
		for (String student : students) {
			System.out.println("Student's name is : " + student);
		}
	}

	private List<String> addElementsArrayList(String input1, String input2, String input3, String input4,
			String input5) {

		List<String> students = null;

		try {
			students = new ArrayList<>();
			students.add(input1);
			students.add(input2);
			students.add(input3);
			students.add(input4);
			students.add(input5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}
}
