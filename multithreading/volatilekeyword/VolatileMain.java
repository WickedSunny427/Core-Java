package com.corejavaprojects.multithreading.volatilekeyword;

public class VolatileMain {

	public static void main(String[] args) {

		new Thread(() -> {
			Student student1 = Student.getIstance();
			System.out.println("Student 1 : " + student1.hashCode());
		}).start();

		new Thread(() -> {
			Student student2 = Student.getIstance();
			System.out.println("Student 2 : " + student2.hashCode());
		}).start();

	}
}