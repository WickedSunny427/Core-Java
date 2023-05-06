package com.corejavaprojects.multithreading.basics.synchronizedexample;

public class RunnableTask implements Runnable {

	private SharedResource sharedResource;

	public RunnableTask(SharedResource sharedResource) {
		this.sharedResource = sharedResource;
	}

	@Override
	public void run() {
		System.out.println("Thread Name Starts: " + Thread.currentThread().getName() + "\t" + "Thread Priority : "
				+ Thread.currentThread().getPriority());

		sharedResource.sharedMethodObjectLevel();
		//sharedResource.synchronizedBlock();

		System.out.println("Thread Name ends: " + Thread.currentThread().getName() + "\t" + "Thread Priority : "
				+ Thread.currentThread().getPriority());
	}
}