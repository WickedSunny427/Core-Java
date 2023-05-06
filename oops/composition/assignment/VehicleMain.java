package com.corejavaprojects.oops.composition.assignment;

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Al2022IW", "Alto LXI", "EN2033#77", "18.34 KG");
		vehicle.getVehicleDetails();
		vehicle = null;
		System.gc();
	}
}