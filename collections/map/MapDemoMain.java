package com.corejavaprojects.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemoMain {

	public static void main(String[] args) {

		Map<String, String> food = new LinkedHashMap<>();
		food.put("Starter", "Paneer Chilly");
		food.put("Main Course", "Biryani");
		food.put("Desert", "Ice Cream");
		food.put("Desert", "Gulab Jamun");
		food.put(null, "Empty Plate");
	//	food.put(null, "Empty Glass");

		System.out.println(food);
		
		MapDemoMain object = new MapDemoMain();
		object.displayMapUsingLamda(food);
		object.displayMapUsingForEach(food);
	}

	private void displayMapUsingForEach(Map<String, String> food) {
		System.out.println("=========== Displaying Using For Each Loop ============");
		Set<Entry<String, String>> set = food.entrySet();
		for (Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	private void displayMapUsingLamda(Map<String, String> food) {
		System.out.println("=========== Displaying Using Lamda ============");
		food.forEach((key, value) -> System.out.println(key + " : " + value));
	}

}
