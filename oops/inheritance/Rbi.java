package com.corejavaprojects.oops.inheritance;

public class Rbi {
	public String repoRate;
	public double fdRate;

	public Rbi(String repoRate) {
		this.repoRate = repoRate;
	}

	public void rules() {
		System.out.println("\n List of RBI rules - :");
		System.out.println("RBI rule 1");
		System.out.println("RBI rule 2");
		System.out.println("Reo Rate : " + repoRate);
	}
}