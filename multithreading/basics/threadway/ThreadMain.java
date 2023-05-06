package com.corejavaprojects.multithreading.basics.threadway;

public class ThreadMain {

	public static void main(String[] args) {

		System.out.println("Main Thread's name : " + Thread.currentThread().getName() + "\t" + "Priority : "
				+ Thread.currentThread().getPriority());
		ThreadTask thread1 = new ThreadTask();
		thread1.start();

		ThreadTask thread2 = new ThreadTask();
		thread2.start();

		ThreadTask thread3 = new ThreadTask();
		thread3.setPriority(7);
		thread3.setName("Custom Thread using Thread Class way ");
		thread3.start();
		// thread3.run(); //It will call main thread only.
	}
}