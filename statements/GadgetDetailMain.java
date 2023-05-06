package com.corejavaprojects.statements;

import java.util.Scanner;

public class GadgetDetailMain {

	private static final String MOBILE = "Mobile";
	private static final String TAB = "Tab";
	private static final String LAPTOP = "Laptop";

	public static void main(String[] args) {
		String input;
		GadgetDetailMain obj = new GadgetDetailMain();

		System.out.println("Enter Device Name : ");
		input = obj.getUserInput();

		obj.createGadget(input);

	}

	private void createGadget(String input) {
		if (MOBILE.equalsIgnoreCase(input)) {
			System.out.println("#2015152");
			System.out.println("Redmi Note 10 Pro");
			System.out.println("Electronics");
			System.out.println(
					"Redmi Note 10 Pro best price is Rs. 15999 as on 30th November 2022. See full specifications, expert reviews, user ratings, and more. Compare Redmi Note 10 .");
			System.out.println("Rs 15,999 -/");
			System.out.println("Nov,2021");
		}

		else if (TAB.equalsIgnoreCase(input)) {
			System.out.println("#6500790");
			System.out.println("Samsung Galaxy Tab A8 2021");
			System.out.println("Electronics");
			System.out.println();
			System.out.println(
					"Samsung Galaxy Tab A8 2021 is a power-packed performer, an ideal choice for both personal as well as professional use. The device will help you to enjoy seamless operations, great battery power, expandable storage space and a standard camera setup for conference calls. ");
			System.out.println("Rs 17,499 -/");
			System.out.println("Jan,2019");
		}

		else if (LAPTOP.equalsIgnoreCase(input)) {
			System.out.println("#310321");
			System.out.println("DELL Inspiron 15 3000 Laptop");
			System.out.println("Electronics");
			System.out.println(
					"Dimensions & Weight  Height (front): 17.50 mm Height (rear): 18.99 mm Width: 358.50 mm Depth: 235.56 Weight: 1.85 k");
			System.out.println("Feb,2019");
		} else
			System.out.println("Invalid Input !!!!!!");
	}

	private String getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
}