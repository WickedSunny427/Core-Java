package com.corejavaprojects.multithreading.locks.mutex;
import java.util.concurrent.locks.ReentrantLock;

public class MutexExample {
    private int count = 0;
    private ReentrantLock lock = new ReentrantLock(); // ReentrantLock used as a mutex

    public void increment() {
        lock.lock(); // Acquiring the lock
        try {
            count++; // Accessing the shared resource
        } finally {
            lock.unlock(); // Releasing the lock
        }
    }

    public int getCount() {
        lock.lock(); // Acquiring the lock
        try {
            return count; // Accessing the shared resource
        } finally {
            lock.unlock(); // Releasing the lock
        }
    }

    public static void main(String[] args) {
        MutexExample mutexExample = new MutexExample();

        // Start multiple threads to increment the count
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                mutexExample.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                mutexExample.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count: " + mutexExample.getCount());
    }
}
