package com.corejavaprojects.generics.assignments;

public class SingleMain {

	public static void main(String[] args) {

		SingleParameter<Float> single1 = new SingleParameter<>();
		single1.setType(99.78f);
		System.out.println("Data : " + single1.getType());

		SingleParameter<Boolean> single2 = new SingleParameter<>();
		single2.setType(true);
		System.out.println("Data : " + single2.getType());

		SingleParameter<Character> single3 = new SingleParameter<>();
		single3.setType('S');
		System.out.println("Data : " + single3.getType());

	}

}
