package com.corejavaprojects.method;

public class College {

	public static void getCollegeName() {
		System.out.println("IIT Bangalore");
	}

	public static String getRank() {
		String rank = "1st";
		return rank;
	}

	public static void main(String[] args) {


		College.getCollegeName();

		String rank = College.getRank();
		System.out.println(rank);
	}
}