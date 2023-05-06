package com.corejavaprojects.collections.concurrentcollections;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {

	public static void main(String[] args) {
		ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");

		System.out.println(queue.poll()); // Output: "one"

	}

}
