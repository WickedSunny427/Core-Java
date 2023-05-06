package com.corejavaprojects.multithreading.locks.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionExample {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private int count = 0;

	public void increment() {
		lock.lock();
		try {
			count++;
			System.out.println("Incremented count to " + count);
			condition.signalAll(); // Wake up any waiting threads
		} finally {
			lock.unlock();
		}
	}

	public void waitForCount(int targetCount) throws InterruptedException {
		lock.lock();
		try {
			while (count < targetCount) {
				System.out.println("Waiting for count to reach " + targetCount);
				condition.await(); // Release lock and wait
			}
		} finally {
			lock.unlock();
		}
		System.out.println("Count has reached " + targetCount);
	}

	public static void main(String[] args) throws InterruptedException {
		ConditionExample example = new ConditionExample();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				example.increment();
				sleep(10000);
			}
		});

		Thread t2 = new Thread(() -> {
			try {
				example.waitForCount(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

	private static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
