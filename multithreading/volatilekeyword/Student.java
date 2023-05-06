package com.corejavaprojects.multithreading.volatilekeyword;

public class Student {
	private volatile static Student studentObject;		//Volatile makes variable as Thread safe.

	//Singleton Design Pattern
	public static Student getIstance() {
		if (studentObject == null) {
			synchronized (Student.class) {
				if (studentObject == null) {
					studentObject = new Student();
				}
			}
		}
		return studentObject;
	}
}