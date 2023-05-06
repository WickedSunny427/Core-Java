package com.corejavaprojects.multithreading.executorframework.submitwithcallable;

import java.util.concurrent.Callable;

public class Document implements Callable<String> {

	private String fileName;
	private String fileType;

	public Document(String fileName, String fileType) {
		this.fileName = fileName;
		this.fileType = fileType;
	}

	@Override
	public String call() throws Exception {
		System.out.println("Input for Runnable task: " + fileName + " and type :" + fileType + " : "
				+ Thread.currentThread().getName() + " Start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// logic for file management
		System.out.println("Input for Runnable task: " + fileName + " and type :" + fileType + " : "
				+ Thread.currentThread().getName() + " End");
		return fileName + " and " + fileType;
	}
}