package com.corejavaprojects.multithreading.locks.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchMain {

	public static void main(String[] args) {

		final CountDownLatch countDownLatch = new CountDownLatch(3);

		Thread backendServices = new Thread(new SharedResource("Back End Services", 20000, countDownLatch));
		Thread cacheServices = new Thread(new SharedResource("Cache Services", 30000, countDownLatch));
		Thread mailingServices = new Thread(new SharedResource("Mailing Services", 40000, countDownLatch));

		backendServices.start();
		cacheServices.start();
		mailingServices.start();

		try {
			countDownLatch.await(50, TimeUnit.SECONDS);
			System.out.println("All dependent services are UP !!! Launching main application now on port 4200.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
