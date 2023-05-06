package com.corejavaprojects.collections.concurrentcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListDemo {

	public static void main(String[] args) {

		List<String> myList = new ArrayList<>();

		myList.add("I");
		myList.add("Love");
		myList.add("India");

		Collections.synchronizedList(myList);

		System.out.println("Printing Synchronised List : " + myList);
	}

}
