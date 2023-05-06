package com.corejavaprojects.oops.composition;

public class Human {
	private String gender;
	private String height;
	private final BodyPart bodyPart;

	public Human(String gender, String height, String partName, String partHealth) {
		this.gender = gender;
		this.height = height;
		this.bodyPart = new BodyPart(partName, partHealth);
	}

	public void getHumanDetails() {
		System.out.println("Human is a :  " + gender);
		System.out.println("Height is a :  " + height);
		bodyPart.getBodyPartDetails();
	}
}