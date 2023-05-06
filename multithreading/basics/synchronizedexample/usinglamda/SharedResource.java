package com.corejavaprojects.multithreading.basics.synchronizedexample.usinglamda;

public class SharedResource {

	public synchronized void sharedMethodObjectLevel() {
		System.out.println("Shared Resource starts : " + " Thread's name : " + Thread.currentThread().getName() + "\t"
				+ "Priority : " + Thread.currentThread().getPriority());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Shared Resource ends : " + " Thread's name : " + Thread.currentThread().getName() + "\t"
				+ "Priority : " + Thread.currentThread().getPriority());
	}

	public void synchronizedBlock() {
		synchronized (this) {
			System.out.println("Shared Resource starts : " + " Thread's name : " + Thread.currentThread().getName()
					+ "\t" + "Priority : " + Thread.currentThread().getPriority());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Shared Resource ends : " + " Thread's name : " + Thread.currentThread().getName() + "\t"
					+ "Priority : " + Thread.currentThread().getPriority());
		}
	}
}