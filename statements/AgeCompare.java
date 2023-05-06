package com.corejavaprojects.statements;

public class AgeCompare {

	private static final int CHILD_AGE = 5;
	private static final int MINOR_AGE = 17;
	private static final int ADULT_AGE = 18;

	public static void main(String[] args) {

		AgeCompare ageCompare = new AgeCompare();

		System.out.println(ageCompare.childAuthentication(6));
		System.out.println(ageCompare.MinorAuthentication(19));
		System.out.println(ageCompare.AdultAuthentication(35));
	}

	private String childAuthentication(int childAge) {
		if (AgeCompare.CHILD_AGE >= childAge) {
			return "You are a child !!";
		}
		return null;
	}

	private String MinorAuthentication(int minorAge) {
		if (AgeCompare.MINOR_AGE >= minorAge)
			return "You are a Minor !!";
		else
			return "You are not a Minor !!";
	}

	private String AdultAuthentication(int adultAge) {
		if (AgeCompare.MINOR_AGE < adultAge)
			return "You are an Adult !!";
		else if (adultAge > AgeCompare.ADULT_AGE)
			return "You are an Adult !!";
		else
			return "You are not an Adult !!";
	}
}