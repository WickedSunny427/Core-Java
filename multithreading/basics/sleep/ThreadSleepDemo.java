package com.corejavaprojects.multithreading.basics.sleep;

public class ThreadSleepDemo {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Thread 1: " + i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Thread 2: " + i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		// Wait for both threads to finish using join() method
		t1.join();
		t2.join();

		System.out.println("Main thread finished.");
	}
}
