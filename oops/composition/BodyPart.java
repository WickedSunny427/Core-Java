package com.corejavaprojects.oops.composition;

public class BodyPart {
	private String partName;
	private String partHealth;

	public BodyPart(String partName, String partHealth) {
		this.partName = partName;
		this.partHealth = partHealth;
	}

	public void getBodyPartDetails() {
		System.out.println("The body part is : " + partName);
		System.out.println("Part's health is : " + partHealth);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Body part destroyed ...");
	}
}