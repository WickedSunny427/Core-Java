package com.corejavaprojects.multithreading.locks.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MeetingExample {

	public static void main(String[] args) {
	
		final int PARTICIPANT = 10;
		
		CyclicBarrier cyclicBarrier=new CyclicBarrier(PARTICIPANT, ()->{System.out.println("All participants have arrived now and are connected.");});

		
		for (int i = 0; i <PARTICIPANT; i++) {
			Thread participant=new Thread(()->{
				System.out.println("Participant "+Thread.currentThread().getId() +" Arrived");
				try {
					Thread.sleep(20000);
					cyclicBarrier.await();
					System.out.println("Participant "+Thread.currentThread().getId() +" Started the meeting now.");
					
				} catch (InterruptedException | BrokenBarrierException e) {
					e.printStackTrace();
				}
			});
			participant.start();
		}
	}

}
