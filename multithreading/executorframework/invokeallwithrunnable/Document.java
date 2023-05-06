package com.corejavaprojects.multithreading.executorframework.invokeallwithrunnable;

public class Document implements Runnable {

	private String fileName;
	private String fileType;

	public Document(String fileName, String fileType) {
		this.fileName = fileName;
		this.fileType = fileType;
	}

	@Override
	public void run() {
		System.out.println("Input for Runnable task: " + fileName + " and type :" + fileType + " : "
				+ Thread.currentThread().getName() + " Start");
		try {
			Thread.sleep(5000);
			// logic for file management
			System.out.println(fileName + " and " + fileType);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Input for Runnable task: " + fileName + " and type :" + fileType + " : "
				+ Thread.currentThread().getName() + " End");
	}
}