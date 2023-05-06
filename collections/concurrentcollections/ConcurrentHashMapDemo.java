package com.corejavaprojects.collections.concurrentcollections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {

		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

		System.out.println("ConcurrentHashMap locks separate segments.");

		map.put("SUNNY", "TCS");
		map.put("RITESH", "CAPE GEMINI");
		map.put("JAHANVI", "WIPRO");
		map.put("SARVAN", "WIPRO");

		System.out.println("Data : " + map);
	}

}
