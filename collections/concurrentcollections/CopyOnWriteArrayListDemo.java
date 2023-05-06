package com.corejavaprojects.collections.concurrentcollections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) throws InterruptedException {

		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		System.out.println("CopyOnWriteArrayList - 16 Threads can read and one Thread can write at a time !!!");
		new Thread(() -> {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "Starts");
			list.add("Delhi");
			System.out.println(Thread.currentThread().getName() + "Ends");
		}).start();

		new Thread(() -> {
			try {
				Thread.sleep(12000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "Starts");
			list.add("Mumbai");
			System.out.println(Thread.currentThread().getName() + "Ends");

		}).start();

		new Thread(() -> {
			try {
				Thread.sleep(14000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "Starts");
			list.add("Chennai");
			System.out.println(Thread.currentThread().getName() + "Ends");

		}).start();
		Thread.currentThread().sleep(18000);
		System.out.println("Data is : " + list);
	}

}
