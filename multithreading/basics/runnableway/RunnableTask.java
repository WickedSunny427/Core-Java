package com.corejavaprojects.multithreading.basics.runnableway;

public class RunnableTask implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Name : " + Thread.currentThread().getName() + "\t" + "Thread Priority : "
				+ Thread.currentThread().getPriority());
	}
}