package com.corejavaprojects.multithreading.semaphorekeyword;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

	public static void main(String[] args) {

		Semaphore semaphore = new Semaphore(2);
		SharedResource resource = new SharedResource("Movie", semaphore);

		Thread thread1 = new Thread(resource);
		Thread thread2 = new Thread(resource);
		Thread thread3 = new Thread(resource);
		Thread thread4 = new Thread(resource);
		Thread thread5 = new Thread(resource);
		Thread thread6 = new Thread(resource);
		Thread thread7 = new Thread(resource);
		Thread thread8 = new Thread(resource);
		Thread thread9 = new Thread(resource);
		Thread thread10 = new Thread(resource);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();
	}
}
