package com.corejavaprojects.multithreading.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForJoinExample extends RecursiveTask<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3956386038824231457L;

	private static final int THRESHOLD = 1000;

	private int array[];
	private int start;
	private int end;

	public ForJoinExample(int[] array, int start, int end) {
		this.array = array;
		this.start = start;
		this.end = end;
	}

	@Override
	protected Integer compute() {
		int sum = 0;
		if (end - start <= THRESHOLD) {
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			System.out.println("No Forking !!!");
		} else {
			int mid = (end + start) / 2;
			ForJoinExample leftHalf = new ForJoinExample(array, start, mid);
			ForJoinExample rightHalf = new ForJoinExample(array, mid, end);

			leftHalf.fork();
			rightHalf.fork();

			sum = leftHalf.join() + rightHalf.join();
			System.out.println("After Forking !!!" + Thread.currentThread().getId());
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = new int[10000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println("Test");
		ForJoinExample myTask = new ForJoinExample(arr, 0, arr.length);

		// ForkJoinPool pool = new ForkJoinPool();
		ForkJoinPool pool = ForkJoinPool.commonPool();

		//int sum = myTask.invoke();//Directly using common pool
		int sum = pool.invoke(myTask);//Using custom pool.

		System.out.println("Sum: " + sum);
	}

}