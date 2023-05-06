package com.corejavaprojects.multithreading.basics.join;

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
//		System.out.println("Main Thread's name : " + Thread.currentThread().getName() + "\t" + "Priority : "
//				+ Thread.currentThread().getPriority());

		Thread thread1 = new Thread(() -> {
			try {
				System.out.println("Thread Name Started : " + Thread.currentThread().getName() + "\t"
						+ "Thread Priority : " + Thread.currentThread().getPriority());
				Thread.sleep(10000);

			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Thread Name Ended: " + Thread.currentThread().getName() + "\t" + "Thread Priority : "
					+ Thread.currentThread().getPriority());
		});

		Thread thread2 = new Thread(() -> {
			try {
				System.out.println("Thread Name Started : " + Thread.currentThread().getName() + "\t"
						+ "Thread Priority : " + Thread.currentThread().getPriority());
				Thread.sleep(10000);

			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Thread Name Ended: " + Thread.currentThread().getName() + "\t" + "Thread Priority : "
					+ Thread.currentThread().getPriority());
		});
		thread1.setName("A");
		thread2.setName("B");
		//thread1.start();
		//thread1.join();// thread 2 will wait until thread 1 completes its execution.

		thread2.start();
		thread2.join();// thread 1 will wait until thread 1 completes its execution.
		thread1.start();
	}
}