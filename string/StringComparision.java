package com.corejavaprojects.string;

import java.util.Scanner;

public class StringComparision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("========= STRING COMPARISION DEMO =========== \n");

		System.out.println("Enter first string :");
		String string1 = sc.next();

		System.out.println("Enter second string :");
		String string2 = sc.next();

		StringComparision stringComparision = new StringComparision();

		boolean result1 = stringComparision.stringEqualsOperator(string1, string2);
		System.out.println("The = = Operator returns " + result1);

		boolean result2 = stringComparision.stringEqualsMethod(string1, string2);
		System.out.println("The equals() Method returns " + result2);

		boolean result3 = stringComparision.stringEqualsIgnore(string1, string2);
		System.out.println("The equalsIgnorecase()  Method returns " + result3);

		boolean result4 = stringComparision.stringEqualCompareMethod(string1, string2);
		System.out.println("The compareTo()  Method returns " + result4);

		boolean result5 = stringComparision.stringEqualsCompareIgnore(string1, string2);
		System.out.println("The compareToIgnoreCase()  Method returns " + result5);

	}

	public boolean stringEqualsOperator(String string1, String string2) {
		if (string1 == string2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean stringEqualsMethod(String string1, String string2) {
		if (string1.equals(string2)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean stringEqualCompareMethod(String string1, String string2) {
		if (string1.compareTo(string2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean stringEqualsIgnore(String string1, String string2) {
		if (string1.equalsIgnoreCase(string2)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean stringEqualsCompareIgnore(String string1, String string2) {
		if (string1.compareToIgnoreCase(string2) == 0) {
			return true;
		} else {
			return false;
		}
	}
}