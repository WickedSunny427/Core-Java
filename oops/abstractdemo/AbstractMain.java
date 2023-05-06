package com.corejavaprojects.oops.abstractdemo;

public class AbstractMain {

	public static void main(String[] args) {

		Hdfc hdfc = new Hdfc();
		System.out.println(" Intrest rate % is " + hdfc.getRateOfInterest());

		Axis axis = new Axis();
		System.out.println(" Intrest rate % is " + axis.getRateOfInterest());
		
		Bank.getStaticMethod();
		Axis.getStaticMethod();
		hdfc.getNonStaticMethod();
		
	}
}