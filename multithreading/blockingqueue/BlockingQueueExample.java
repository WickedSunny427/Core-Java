package com.corejavaprojects.multithreading.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class BlockingQueueExample {

	public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(5); // Creating a bounded LinkedBlockingQueue with capacity 5
        //BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(5); // Creating a bounded ArrayBlockingQueue with capacity 5
        //BlockingQueue<Integer> blockingQueue = new PriorityBlockingQueue<>(5); // Creating a bounded PriorityBlockingQueue with capacity 5
        //BlockingQueue<Integer> blockingQueue = new SynchronousQueue(false); // Creating a bounded SynchronousQueue with capacity 5

	        // Producer thread
	        Thread producerThread = new Thread(() -> {
	            try {
	                int i = 1;
	                while (true) {
	                    blockingQueue.put(i); // Adding elements to the queue
	                    System.out.println("Producer produced: " + i);
	                    Thread.sleep(3000); // Sleep for 1 second
	                    i++;
	                }
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        // Consumer thread
	        Thread consumerThread = new Thread(() -> {
	            try {
	                while (true) {
	                    Integer element = blockingQueue.take(); // Removing elements from the queue
	                    System.out.println("Consumer consumed: " + element);
	                    Thread.sleep(10000); // Sleep for 2 seconds
	                }
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        producerThread.start();
	        consumerThread.start();
	    }
}