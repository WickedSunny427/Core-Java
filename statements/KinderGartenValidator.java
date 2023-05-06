package com.corejavaprojects.statements;

import java.util.Scanner;

public class KinderGartenValidator {

	private int input;

	private static final int LKG_AGE = 3;
	private static final int UKG_AGE = 4;
	private static final int PREP_AGE = 5;

	public static void main(String[] args) {

		KinderGartenValidator obj = new KinderGartenValidator();

		System.out.println("Enter students age : ");
		obj.input = obj.getUserInput();

		System.out.println(obj.validateAddmission(obj.input));

	}

	private String validateAddmission(int input) {
		String message;

		if (input > 0 && LKG_AGE == input)
			message = "Your child is eligible for LKG NOW !!!";
		else if (UKG_AGE == input)
			message = "Your child is eligible for UKG NOW !!!";

		else if (PREP_AGE == input)
			message = "Your child is eligible for PREP NOW !!!";
		else
			message = "INVALID INPUT !!! TY AGAIN...";
		return message;
	}

	private int getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}