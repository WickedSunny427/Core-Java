package com.corejavaprojects.collections.concurrentcollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SychronizedMap {

	public static void main(String[] args) {

		Map<String, String> myMap = new HashMap<>();
		System.out.println("ConcurrentHashMap locks separate segments.");

		myMap.put("SUNNY", "TCS");
		myMap.put("RITESH", "CAPE GEMINI");
		myMap.put("JAHANVI", "WIPRO");
		myMap.put("SARVAN", "WIPRO");

		Collections.synchronizedMap(myMap);

		System.out.println("Printing Synchronized map : " + myMap);

	}

}
