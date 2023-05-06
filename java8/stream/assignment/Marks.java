package com.corejavaprojects.java8.stream.assignment;

import java.util.Random;

public class Marks {
	private int id;
	private int marks1;
	private int marks2;
	private int marks3;
	private int total;

	public Marks(int id) {
		this.id = id;
		Random random = new Random();
		this.marks1 = random.nextInt(101);
		this.marks2 = random.nextInt(101);
		this.marks3 = random.nextInt(101);
		this.total = this.marks1 + this.marks2 + this.marks3;
	}

	@Override
	public String toString() {
		return "Marks [id=" + id + ", marks1=" + marks1 + ", marks2=" + marks2 + ", marks3=" + marks3 + ", total="
				+ total + "]";
	}

	public int getId() {
		return id;
	}

	public int getMarks1() {
		return marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public int getTotal() {
		return total;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
