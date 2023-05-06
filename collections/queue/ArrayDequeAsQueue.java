package com.corejavaprojects.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeAsQueue {

	public static void main(String[] args) {
		// Create an ArrayDeque as a Queue
		Queue<Integer> queue = new ArrayDeque<>();

		// Enqueue elements
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		System.out.println("Queue Original : " + queue);

		// Dequeue elements
		int front = queue.poll();
		System.out.println("Front element: " + front); // Output: Front element: 10
		System.out.println("Queue now : " + queue);

		// Peek at the front element
		int peek = queue.peek();
		System.out.println("Front element (peek): " + peek); // Output: Front element (peek): Python
		System.out.println("Queue now : " + queue);
	}
}