 package com.corejavaprojects.multithreading.basics.threadlamdaway;

public class LamdaMain {

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			System.out.println("Thread Name : " + Thread.currentThread().getName() + "\t" + "Thread Priority : "
					+ Thread.currentThread().getPriority());
		});
		thread1.start();

		Thread thread2 = new Thread(() -> {
			System.out.println("Thread Name : " + Thread.currentThread().getName() + "\t" + "Thread Priority : "
					+ Thread.currentThread().getPriority());
		});
		thread2.setPriority(9);
		thread2.setName("MyLamda Thread 2");
		thread2.start();
	}
}