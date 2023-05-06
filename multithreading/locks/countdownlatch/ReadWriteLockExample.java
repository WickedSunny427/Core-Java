package com.corejavaprojects.multithreading.locks.countdownlatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

	private static List<Integer> list = new ArrayList<>();
	private static ReadWriteLock rwLock = new ReentrantReadWriteLock();

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					rwLock.writeLock().lock();
					list.add(new Random().nextInt());
				} finally {
					rwLock.writeLock().unlock();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					rwLock.readLock().lock();
					System.out.println(list);
				} finally {
					rwLock.readLock().unlock();
				}
			}
		});

		t1.start();
		t2.start();
	}
}