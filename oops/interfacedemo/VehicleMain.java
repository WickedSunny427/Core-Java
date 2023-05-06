package com.corejavaprojects.oops.interfacedemo;

public class VehicleMain {

	public static void main(String[] args) {

		Vehicle nano = new Nano();
		nano.engine();

		Vehicle scorpio = new Scorpio();
		scorpio.engine();

		nano.Drivers();
		Vehicle.battery();
	}
}