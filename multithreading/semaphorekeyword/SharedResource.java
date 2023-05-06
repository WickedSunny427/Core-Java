package com.corejavaprojects.multithreading.semaphorekeyword;

import java.util.concurrent.Semaphore;

public class SharedResource implements Runnable {

	private String resourceName;
	Semaphore semaphore;

	public SharedResource(String resourceName, Semaphore semaphore) {
		this.resourceName = resourceName;
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		System.out.println("Thread Name Starts: " + Thread.currentThread().getName());

		// Semaphore Area to lock task
		try {
			semaphore.acquire();
			System.out.println("The shared resource : " + resourceName + " is now being accessed by -> "
					+ Thread.currentThread().getName());
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}

		System.out.println("Thread Name Ends: " + Thread.currentThread().getName());
	}
}