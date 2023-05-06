package com.corejavaprojects.oops.composition.assignment;

public class Vehicle {
	private String model;
	private String name;
	private final Engine engine;

	public Vehicle(String model, String name, String engineNumber, String engineWeight) {
		this.model = model;
		this.name = name;
		this.engine = new Engine(engineNumber, engineWeight);
	}

	public void getVehicleDetails() {
		System.out.println("Vehicle Model : " + model);
		System.out.println("Vehicle Name : " + name);
		engine.getEngineDetails();
	}
}