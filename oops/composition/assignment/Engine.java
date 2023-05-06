package com.corejavaprojects.oops.composition.assignment;

public class Engine {
	private String engineNumber;
	private String engineWeight;

	public Engine(String engineNumber, String engineWeight) {
		this.engineNumber = engineNumber;
		this.engineWeight = engineWeight;
	}

	public void getEngineDetails() {
		System.out.println("Engine Number : " + engineNumber);
		System.out.println("Engine Weight : " + engineWeight);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Engine destroyed ...");
	}
}