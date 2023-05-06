package com.corejavaprojects.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {

		Example4 obj = new Example4();
		System.out.println("===== READING DATA FROM A USER AND WRITING IT INTO A FILE ========== \n");

		System.out.println("Enter your text you want to save in FileA  : ");
		String data = obj.getUserInput();

		try {
			obj.saveDataToFile(data);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("\nReading data from FileA ...");
			obj.readDataFromFile();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readDataFromFile() throws IOException {
		BufferedReader br = null;
		// Reading data to FileA using try catch and finally.
		try {
			File file = new File("D:\\eMexo\\MyWorkspaces\\Workspace_1\\CoreJavaProject\\FileA.txt");
			br = new BufferedReader(new FileReader(file));

			String st;

			while ((st = br.readLine()) != null)
				System.out.println(st);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
	}

	private void saveDataToFile(String data) throws IOException {

		// Writing data to FileA using try with resources.
		try (FileOutputStream fos = new FileOutputStream("FileA.txt");) {
			byte arr[] = data.getBytes();
			fos.write(arr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(
				"\nData saved to D:\\\\eMexo\\\\MyWorkspaces\\\\Workspace_1\\\\CoreJavaProject\\\\FileA.txt successfully ... \nResources closed  automatically.");
	}

	private String getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}