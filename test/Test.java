package com.corejavaprojects.test;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + "Started");

		
		System.out.println(Thread.currentThread().getName() + "Ended");
		Thread t1=new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
		});
		t1.start();
		t1.join();
	}
}
