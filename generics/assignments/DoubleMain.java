package com.corejavaprojects.generics.assignments;

public class DoubleMain {
	public static void main(String[] args) {

		DoubleParameter<String, Character> double1 = new DoubleParameter<>();
		double1.setKey("Dhoni");
		double1.setValue('M');
		System.out.println("Data : " + double1.getKey() + " and " + double1.getValue());

		DoubleParameter<Double, String> double2 = new DoubleParameter<>();
		double2.setKey(65.565);
		double2.setValue("Sachin");
		System.out.println("Data : " + double2.getKey() + " and " + double2.getValue());
	}
}