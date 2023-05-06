package com.corejavaprojects.collections.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueAsQueue {

	public static void main(String[] args) throws InterruptedException {
		// Create a BlockingQueue as a Queue
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

		// Enqueue elements
		queue.put(10);
		queue.put(20);
		queue.put(30);
		System.out.println("Queue Original : " + queue);

		// Dequeue elements
		int front = queue.take();
		System.out.println("Front element: " + front); // Output: Front element: 10
		System.out.println("Queue now : " + queue);

		// Peek at the front element
		int peek = queue.peek();
		System.out.println("Front element (peek): " + peek); // Output: Front element (peek): 20
		System.out.println("Queue now : " + queue);
	}
}