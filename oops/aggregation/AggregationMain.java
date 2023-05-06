package com.corejavaprojects.oops.aggregation;

public class AggregationMain {

	public static void main(String[] args) {
		BodyPart bodyPart = new BodyPart("Heart", "Healthy (4.5/5)");
		Human human = new Human("Male", "6.4 Feet",bodyPart);

		human.getHumanDetails();
		human = null;
		System.gc();
	}
}