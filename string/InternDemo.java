package com.corejavaprojects.string;

public class InternDemo {

	public static void main(String[] args) {

		String s1 = "hello"; // Pool
		String s2 = "hello"; // Pool
		String s3 = new String("hello"); // Heap
		String s4 = s3.intern(); // copies from heap to String pool

		System.out.print("Pool Vs Pool : ");
		System.out.println(s1 == s2);

		System.out.print("Pool Vs Heap : ");
		System.out.println(s2 == s3);

		System.out.print("Still it Heap Vs Pool : ");
		System.out.println(s3 == s4);

		System.out.print("Now its Original Pool Vs Intern Pool : ");
		System.out.println(s1 == s4);

		System.out.print("Now its Original Pool Vs Intern Pool : ");
		System.out.println(s2 == s4);
	}
}