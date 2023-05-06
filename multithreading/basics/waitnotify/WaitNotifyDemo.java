package com.corejavaprojects.multithreading.basics.waitnotify;

public class WaitNotifyDemo {
	public static void main(String[] args) throws InterruptedException {
	
		Thread t1 = new Thread(() -> {
			synchronized (WaitNotifyDemo.class) {
				System.out.println("Thread 1: Acquired lock on WaitNotifyDemo.class, waiting...");
				try {
					System.out.println("Thread 1 entering wait state ...");
					WaitNotifyDemo.class.wait();
					System.out.println("Thread 1 exiting wait state ...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 1: Got notified, releasing lock on WaitNotifyDemo.class");
			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (WaitNotifyDemo.class) {
				System.out.println("Thread 2: Acquired lock on WaitNotifyDemo.class, sleeping for 15 seconds...");
				try {
					Thread.sleep(15000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				WaitNotifyDemo.class.notify();
				System.out.println("Thread 2: Notified, releasing lock on WaitNotifyDemo.class");
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
}