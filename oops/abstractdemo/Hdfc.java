package com.corejavaprojects.oops.abstractdemo;

public class Hdfc extends Bank {

	public Hdfc() {
		super("PNB");
		System.out.println("Defaul HDFC Constructor calls Abstratc class Parametrized constructor");
	}

	@Override
	int getRateOfInterest() {
		return 3;
	}
}