package com.corejavaprojects.oops.composition;

public class CompositionMain {

	public static void main(String[] args) {
		Human human = new Human("Male", "6.4 Feet", "Heart", "Healthy (4.5/5)");

		human.getHumanDetails();
		human = null;
		System.gc();
	}
}