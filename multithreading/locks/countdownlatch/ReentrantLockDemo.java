package com.corejavaprojects.multithreading.locks.countdownlatch;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
	private static ReentrantLock fairLock = new ReentrantLock(true);
	private static ReentrantLock unfairLock = new ReentrantLock(true);

	public static void main(String[] args) {

		Thread fairThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Fair Thread started.");
				fairLock.lock();
				try {
					System.out.println("Fair Thread acquired the lock.");
					// Simulate some work
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					fairLock.unlock();
					System.out.println("Fair Thread released the lock.");
				}
			}
		});

		Thread unfairThread = new Thread(() -> {
			System.out.println("Unfair Thread started.");
			unfairLock.lock();
			try {
				System.out.println("Unfair Thread acquired the lock.");
				// Simulate some work
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				unfairLock.unlock();
				System.out.println("Unfair Thread released the lock.");
			}
		});

		
		fairThread.start();
		unfairThread.start();
	}

}
