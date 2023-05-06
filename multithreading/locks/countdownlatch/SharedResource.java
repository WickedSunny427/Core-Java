package com.corejavaprojects.multithreading.locks.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class SharedResource implements Runnable {

	private String resourceName;
	private int startTime;
	CountDownLatch countDownLatch;

	public SharedResource(String resourceName, int startTime, CountDownLatch countDownLatch) {
		super();
		this.resourceName = resourceName;
		this.startTime = startTime;
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		System.out.println(resourceName + " Initializing :  " + Thread.currentThread().getName()+"\n");

		// Latch Area to lock task
		try {
			Thread.sleep(startTime);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(resourceName + " : is up and running now ...\n");
	}
}