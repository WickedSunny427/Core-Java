package com.corejavaprojects.multithreading.basics.runnableway;

public class RunnableMain {

	public static void main(String[] args) {
		System.out.println("Main Thread's name : " + Thread.currentThread().getName() + "\t" + "Priority : "
				+ Thread.currentThread().getPriority());

		RunnableTask task = new RunnableTask();

		Thread thread1 = new Thread(task);
		thread1.start();

		Thread thread2 = new Thread(task);
		thread2.start();

		Thread thread3 = new Thread(task);
		thread3.setPriority(9);
		thread3.setName("Custom Thread");
		thread3.start();
	}
}