package com.corejavaprojects.oops.aggregation.assignment;

public class VehicleMain {
	public static void main(String[] args) {
		Engine engine = new Engine("EN2033#77", "18.34 KG");
		Vehicle vehicle = new Vehicle("Al2022IW", "Alto LXI", engine);
		vehicle.getVehicleDetails();
		vehicle = null;
		System.gc();
	}
}