package com.corejavaprojects.oops.aggregation;

public class Human {
	private String gender;
	private String height;
	private final BodyPart bodyPart;

	public Human(String gender, String height, BodyPart bodyPart) {
		this.gender = gender;
		this.height = height;
		this.bodyPart = bodyPart;
	}

	public void getHumanDetails() {
		System.out.println("Human is a :  " + gender);
		System.out.println("Height is a :  " + height);
		bodyPart.getBodyPartDetails();
	}
}