package com.corejavaprojects.multithreading.basics.yield;

public class YieldDemo {

	public static void main(String[] args) throws InterruptedException {

		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Therad 1 : " + i);
				Thread.yield();
				
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Therad 2 : " + i);
				Thread.yield();
				
			}
		});

		thread1.start();
		thread2.start();
	
	}

}
