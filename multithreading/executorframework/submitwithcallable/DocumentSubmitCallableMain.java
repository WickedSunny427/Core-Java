package com.corejavaprojects.multithreading.executorframework.submitwithcallable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DocumentSubmitCallableMain {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(3);

		String[] fileNames = { "File_1", "File_2", "File_3", "File_4", "File_5", "File_6", "File_7", "File_8", "File_9",
				"File_10" };

		List<String> fileList = Arrays.asList(fileNames);
		List<Document> taskList = new ArrayList<>();

		fileList.forEach(fileName -> {
			Document document = new Document(fileName, ".jpg");
			Future<String> response = service.submit(document);

			try {
				System.out.println("Response :" + response.get());
			} catch (Exception e) {
				e.printStackTrace();
			}

			taskList.add(document);
		});

		// List<Future<String>> response = service.invokeAll(taskList);

		/*
		 * response.forEach(res -> { try { System.out.println(res.get()); } catch
		 * (Exception e) { e.printStackTrace(); } });
		 */
		service.shutdown();

	}
}