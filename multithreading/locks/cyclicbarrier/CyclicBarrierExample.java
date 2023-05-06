package com.corejavaprojects.multithreading.locks.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
	public static void main(String[] args) {
		final int THREAD_COUNT = 3;
		final CyclicBarrier cyclicBarrier = new CyclicBarrier(THREAD_COUNT, () -> {
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Barrier tripped, all threads arrived");
		});

		for (int i = 0; i < THREAD_COUNT; i++) {
			Thread thread = new Thread(() -> {
				System.out.println("Thread " + Thread.currentThread().getId() + " started");
				try {
					System.out.println("Thread " + Thread.currentThread().getId() + " waiting at the barrier");
					Thread.sleep(10000); // Simulating some computation
					cyclicBarrier.await(); // Waiting at the barrier
					System.out.println("Thread " + Thread.currentThread().getId() + " resumed after barrier");
				} catch (InterruptedException | BrokenBarrierException e) {
					e.printStackTrace();
				}
			});
			thread.start();
		}
	}
}
