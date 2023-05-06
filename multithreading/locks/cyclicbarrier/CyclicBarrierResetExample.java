package com.corejavaprojects.multithreading.locks.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierResetExample {
	 public static void main(String[] args) {
	        final int NUMBER_OF_PARTICIPANTS = 3;
	        final CyclicBarrier cyclicBarrier = new CyclicBarrier(NUMBER_OF_PARTICIPANTS, () -> {
	            System.out.println("Meeting started, all participants arrived");
	        });

	        for (int i = 1; i <= NUMBER_OF_PARTICIPANTS; i++) {
	            Thread participant = new Thread(() -> {
	                System.out.println("Participant " + Thread.currentThread().getId() + " arrived");
	                try {
	                    Thread.sleep(15000); // Simulating participants arriving at different times
	                    cyclicBarrier.await(); // Waiting at the barrier
	                    System.out.println("Participant " + Thread.currentThread().getId() + " started the meeting");
	                } catch (InterruptedException | BrokenBarrierException e) {
	                    e.printStackTrace();
	                }
	            });
	            participant.start();
	        }

	        try {
	            Thread.sleep(20000); // Simulating time elapsed for the meeting
	            cyclicBarrier.reset(); // Resetting the CyclicBarrier
	            System.out.println("Meeting finished, resetting the barrier for the next cycle");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Participants join the next cycle of the meeting
	        for (int i = 1; i <= NUMBER_OF_PARTICIPANTS; i++) {
	            Thread participant = new Thread(() -> {
	                System.out.println("Participant " + Thread.currentThread().getId() + " arrived for next cycle");
	                try {
	                    Thread.sleep(25000); // Simulating participants arriving at different times
	                    cyclicBarrier.await(); // Waiting at the barrier for the next cycle
	                    System.out.println("Participant " + Thread.currentThread().getId() + " started the next cycle");
	                } catch (InterruptedException | BrokenBarrierException e) {
	                    e.printStackTrace();
	                }
	            });
	            participant.start();
	        }
	    }
}
