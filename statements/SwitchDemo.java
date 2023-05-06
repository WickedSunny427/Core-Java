package com.corejavaprojects.statements;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		String input;
		SwitchDemo obj = new SwitchDemo();

		System.out.println("Enter Today's day :");
		input = obj.getInput();
		System.out.println(obj.greetDayWishes(input));
	}

	private String greetDayWishes(String day) {

		String message;

		switch (day) {
		case "Sunday":
			message = "Its Sunday have fun !!!";
			break;

		case "Monday":
			message = "Its Monday go to work !!!";
			break;

		case "Tuesday":
			message = "Its Tuesday work from home !!!";
			break;

		case "Wednesday":
			message = "Its Wednesday go for movie !!!";
			break;

		case "Thursday":
			message = "Its Thursday go office again !!!";
			break;

		case "Friday":
			message = "Its Friday night go for shopping !!!";
			break;

		case "Saturday":
			message = "Its Saturday go to eMexo classes !!!";
			break;

		default:
			message = "Invalid Input !!! Try Again...";
			break;
		}
		return message;
	}

	private String getInput() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
}