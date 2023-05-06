package com.corejavaprojects.java8.stream.assignment;

public class Student {

	private String name;
	private double score;
	private int id;

	public Student(String name, double score, int id) {
		this.name = name;
		this.score = score;
		this.id = id;
	}

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public double getScore() {
		return score;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", id=" + id + "]";
	}

}
