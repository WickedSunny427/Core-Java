package com.corejavaprojects.multithreading.basics.waitnotify;

public class WaitNotifySignalExample {

	public static void main(String[] args) throws InterruptedException {
		WaitNotifySignalExample obj = new WaitNotifySignalExample();

		// Thread t1 = new Thread(() -> obj.waitForSignal());
		// Thread t2 = new Thread(() -> obj.sendSignal());

		Thread t1 = new Thread(obj::waitForSignal);
		Thread t2 = new Thread(obj::sendSignal);

		t1.start();

		// Wait for a short time before starting Thread 2
		Thread.sleep(5000);

		t2.start();
	}

	public void waitForSignal() {
		System.out.println("Thread 1 waiting for signal");
		synchronized (this) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread 1 got the signal");
	}

	public void sendSignal() {
		System.out.println("Thread 2 sending signal");
		synchronized (this) {
			try {
				Thread.sleep(10000);
				this.notify();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread 2 sent signal");
	}
}
