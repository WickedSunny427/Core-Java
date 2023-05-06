package com.corejavaprojects.collections.concurrentcollections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronizedSetDemo {

	public static void main(String[] args) {

		Set<String> mySet = new HashSet<>();

		mySet.add("Jai");
		mySet.add("Shree");
		mySet.add("Ram");

		Collections.synchronizedSet(mySet);

		System.out.println("Printing Synchronized set : " + mySet);
	}

}
