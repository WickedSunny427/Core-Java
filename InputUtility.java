package com.corejavaprojects;

import java.util.Scanner;

public class InputUtility {

	public static void main(String[] args) {

		getWord();
		getLine();
		getBoolean();
		getByte();
		getShort();
		getInt();
		getLong();
		getFloat();
		getDouble();

	}

	public static String getWord() {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		return input;
	}

	public static String getLine() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		return input;
	}

	public static boolean getBoolean() {
		Scanner sc = new Scanner(System.in);
		boolean input = sc.nextBoolean();
		sc.close();
		return input;
	}

	public static byte getByte() {
		Scanner sc = new Scanner(System.in);
		byte input = sc.nextByte();
		sc.close();
		return input;
	}

	public static short getShort() {
		Scanner sc = new Scanner(System.in);
		Short input = sc.nextShort();
		sc.close();
		return input;
	}

	public static int getInt() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		return input;
	}

	public static long getLong() {
		Scanner sc = new Scanner(System.in);
		long input = sc.nextLong();
		sc.close();
		return input;
	}

	public static float getFloat() {
		Scanner sc = new Scanner(System.in);
		float input = sc.nextFloat();
		sc.close();
		return input;
	}

	public static double getDouble() {
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		sc.close();
		return input;
	}

}