package com.corejavaprojects.jdbc;

import java.util.Scanner;

public class Utillity {
	public static Scanner sc = new Scanner(System.in);

	public static String getWord() {
		return sc.next();
	}

	public static String getLine() {
		return sc.nextLine();
	}

	public static int getNumber() {
		return sc.nextInt();
	}

	public static double getDecimal() {
		return sc.nextDouble();
	}
}