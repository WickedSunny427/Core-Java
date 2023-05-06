package com.corejavaprojects.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueAsQueue {

	public static void main(String[] args) {
		// Create a PriorityQueue as a Queue with custom comparator
		Queue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());

		// Enqueue elements
		queue.offer("Java");
		queue.offer("Python");
		queue.offer("C++");
		System.out.println("Queue Original : " + queue);

		// Dequeue elements
		String front = queue.poll();
		System.out.println("Front element: " + front); // Output: Front element: Python
		System.out.println("Queue now : " + queue);

		// Peek at the front element
		String peek = queue.peek();
		System.out.println("Front element (peek): " + peek); // Output: Front element (peek): Java
		System.out.println("Queue now : " + queue);
	}
}