package com.corejavaprojects.multithreading.threadlocalvarable;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {

		ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

		threadLocal.set((int) (Math.random() * 100));

		System.out.println("Thread local value for " + Thread.currentThread().getName() + " is " + threadLocal.get());

		Runnable runnable = () -> {
			threadLocal.set((int) (Math.random() * 100));
			System.out
					.println("Thread local value for " + Thread.currentThread().getName() + " is " + threadLocal.get());
		};

		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();
	}
}
