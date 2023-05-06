package com.corejavaprojects.multithreading.basics.synchronizedexample.usinglamda;

public class SynchronizedLamdaMain {

	public static void main(String[] args) {
		SharedResource sharedResource = new SharedResource();

		Thread thread1 = new Thread(() -> {
			sharedResource.sharedMethodObjectLevel();
		});
		thread1.setName("My-Custom-Thread-1");
		thread1.start();

		Thread thread2 = new Thread(() -> {
			sharedResource.sharedMethodObjectLevel();
		});
		thread2.setName("My-Custom-Thread-2");
		thread2.start();
		thread2.setPriority(7);
	}
}