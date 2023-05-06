package com.corejavaprojects.string.mutable;

public class StringMutable {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Sunny");
		StringBuffer s2 = new StringBuffer("Regu");

		StringMutable object = new StringMutable();
		object.displayStringBuilder(s1);
		object.displayStringBuffer(s2);
	}

	private void displayStringBuffer(StringBuffer s1) {
		System.out.println(s1.append(" is learning Java."));
	}

	private void displayStringBuilder(StringBuilder s2) {
		System.out.println(s2.append(" is teaching Java concepts."));
	}
}