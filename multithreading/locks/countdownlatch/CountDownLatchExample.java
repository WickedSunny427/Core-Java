package com.corejavaprojects.multithreading.locks.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        // Create a CountDownLatch with an initial count of 3
        CountDownLatch countDownLatch = new CountDownLatch(3);

        // Create three threads to simulate three tasks
        Thread task1 = new Thread(() -> {
            System.out.println("Task 1 started");
            try {
                Thread.sleep(10000); // Simulating some time-consuming task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 1 completed");
            countDownLatch.countDown(); // Decrementing the count
        });

        Thread task2 = new Thread(() -> {
            System.out.println("Task 2 started");
            try {
                Thread.sleep(15000); // Simulating some time-consuming task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 2 completed");
            countDownLatch.countDown(); // Decrementing the count
        });

        Thread task3 = new Thread(() -> {
            System.out.println("Task 3 started");
            try {
                Thread.sleep(20000); // Simulating some time-consuming task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 3 completed");
            countDownLatch.countDown(); // Decrementing the count
        });

        // Start the three threads
        task1.start();
        task2.start();
        task3.start();

        // Wait for all three tasks to complete
        //countDownLatch.await();
        countDownLatch.await(30, TimeUnit.SECONDS);
        // All tasks have completed, proceed with the main thread
        System.out.println("All tasks completed");
    }
}
