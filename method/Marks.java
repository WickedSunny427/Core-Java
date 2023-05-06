package com.corejavaprojects.method;

public class Marks {

	private static int PRACTICAL = 20;
	private int english;
	private int hindi;

	public Marks() {
		this.english = 87;
		this.hindi = 89;
	}

	public Marks(int english, int hindi) {
		super();
		this.english = english;
		this.hindi = hindi;
	}

	public static int getPractical() {
		return Marks.PRACTICAL;
	}

	public static void main(String[] args) {
		Marks marks = new Marks();
		Marks marks1 = new Marks(97, 99);

		System.out.println(Marks.getPractical());
		System.out.println(marks.english);
		System.out.println(marks.hindi);

		System.out.println(marks1.english);
		System.out.println(marks1.hindi);
	}

}