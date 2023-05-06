package com.corejavaprojects.multithreading.executorframework.executewithrunnable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DocumentInvokeAllRunnableMain {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(3);

		String[] fileNames = { "File_1", "File_2", "File_3", "File_4", "File_5", "File_6", "File_7", "File_8", "File_9",
				"File_10" };

		List<String> fileList = Arrays.asList(fileNames);
		List<Document> taskList = new ArrayList<>();

		fileList.forEach(fileName -> {
			Document document = new Document(fileName, ".jpg");

			taskList.add(document);
			service.execute(document);
		});

		service.shutdown();

	}
}