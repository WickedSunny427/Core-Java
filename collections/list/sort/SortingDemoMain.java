package com.corejavaprojects.collections.list.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

public class SortingDemoMain {

	public static void main(String[] args) {

		List<String> studentsList = new ArrayList<>();

		studentsList.add("Sachin");
		studentsList.add("Dhoni");
		studentsList.add("Virat");
		studentsList.add("Pant");
		studentsList.add("Zaheer");

		SortingDemoMain obj = new SortingDemoMain();
		obj.displayWithoutSorting(studentsList);
		obj.displayAfterSorting(studentsList);
		obj.displayAfterSortingReverseOrder(studentsList);

	}

	private void displayWithoutSorting(List<String> studentsList) {
		System.out.println("-----------  Printing without Sorting -----------\n");
		if (!CollectionUtils.isEmpty(studentsList)) {
			studentsList.forEach(student -> System.out.println(student));
		}
		System.out.println();
	}

	private void displayAfterSorting(List<String> studentsList) {
		System.out.println("----------- Printing after Sorting -----------\n");
		if (!CollectionUtils.isEmpty(studentsList)) {
			Collections.sort(studentsList); // Sorting default order.
			studentsList.forEach(student -> System.out.println(student));
		}
		System.out.println();
	}

	private void displayAfterSortingReverseOrder(List<String> studentsList) {
		System.out.println("----------- Printing after Sorting in Reverse Order -----------\n");
		if (!CollectionUtils.isEmpty(studentsList)) {
			Collections.sort(studentsList, Collections.reverseOrder()); // Sorting reverse order.
			studentsList.forEach(student -> System.out.println(student));
		}
		System.out.println();
	}

}
