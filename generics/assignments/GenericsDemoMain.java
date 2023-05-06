package com.corejavaprojects.generics.assignments;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemoMain {

	public static void main(String[] args) {

		List nonGenericList = new ArrayList();
		nonGenericList.add("Sunny");
		String s = (String) nonGenericList.get(0);// Explicit type casting is required if Generic is not used.

		List<Integer> genericList = new ArrayList<Integer>();
		genericList.add(100);
		int i = genericList.get(0);// No need of explicit Type=Casting..

	}

}
