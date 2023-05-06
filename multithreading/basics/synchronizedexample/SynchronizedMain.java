package com.corejavaprojects.multithreading.basics.synchronizedexample;

public class SynchronizedMain {

	public static void main(String[] args) {
		SharedResource sharedResource = new SharedResource();

		Thread thread1 = new Thread(new RunnableTask(sharedResource));
		thread1.setName("My-Custom-Thread-1");
		thread1.start();
		thread1.setPriority(7);

		Thread thread2 = new Thread(new RunnableTask(sharedResource));
		thread2.setName("My-Custom-Thread-2");
		thread2.start();

	}
}