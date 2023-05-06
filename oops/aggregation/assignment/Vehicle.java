package com.corejavaprojects.oops.aggregation.assignment;

public class Vehicle {
	private String model;
	private String name;
	private final Engine engine;

	public Vehicle(String model, String name, Engine engine) {
		this.model = model;
		this.name = name;
		this.engine = engine;
	}

	public void getVehicleDetails() {
		System.out.println("Vehicle Model : " + model);
		System.out.println("Vehicle Name : " + name);
		engine.getEngineDetails();
	}
}