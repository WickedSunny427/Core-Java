package com.corejavaprojects.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueueMain {

	public static void main(String[] args) {
		// Create a LinkedList as a Queue
		Queue<String> queue = new LinkedList<>();

		// Enqueue elements
		queue.offer("Java");
		queue.offer("Python");
		queue.offer("C++");
		System.out.println("Queue Original : " + queue);

		// Dequeue elements
		String front = queue.poll();
		System.out.println("Front element: " + front); // Output: Front element: Java
		System.out.println("Queue now : " + queue);
		// Peek at the front element
		String peek = queue.peek();
		System.out.println("Front element (peek): " + peek); // Output: Front element (peek): Python
		System.out.println("Queue now : " + queue);
	}
}