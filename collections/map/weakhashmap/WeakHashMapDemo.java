package com.corejavaprojects.collections.map.weakhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {

		Student s1 = new Student(101, "Divya");
		Student s2 = new Student(102, "Vineetha");
		Student s3 = new Student(103, "Mohammed");

		Department d1 = new Department("ENTC", "HUBLI");
		Department d2 = new Department("MECHANICAL", "HYDERABAD");
		Department d3 = new Department("CS", "CHENNAI");

		//Map<Student, Department> hashMap = new HashMap<>();
		Map<Student, Department> hashMap = new WeakHashMap<>();
		hashMap.put(s1, d1);
		hashMap.put(s2, d2);
		hashMap.put(s3, d3);

		System.out.println(" Map Before : " + hashMap + "\t" + " and Size is : " + hashMap.size());

		s1 = null;
		s2 = null;

		System.out.println("Calling GC ...");
		System.gc();
		try {
			System.out.println("Clean up in progress ...");
			Thread.sleep(10000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" Map After : " + hashMap + "\t" + " and Size is : " + hashMap.size());

	}

}
