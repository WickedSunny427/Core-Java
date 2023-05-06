package com.corejavaprojects.oops.inheritance;

public class Hdfc extends Rbi {

	public Hdfc(String repoRate) {
		super("2.5%");
		System.out.println("HDFC gives 5.5 % intrest rate anually. \n");
	}

	public void fdRate() {
		System.out.println("HDFC give " + fdRate + "% intrest annually.");
	}
}