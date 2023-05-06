package com.corejavaprojects.iostream.readerstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ReaderStreamMain {

	public static void main(String[] args) {

		String output = "D:\\eMexo\\MyWorkspaces\\Workspace_1\\CoreJavaProject\\src\\com\\corejavaprojects\\iostream\\readerstream\\OutputFile.txt";

		ReaderStreamMain object = new ReaderStreamMain();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data to be stored in the file below : \n");

		String data = sc.nextLine();
		sc.close();

		object.writeDataToFile(output, data);
		object.readDataFromFile(output);
	}

	private void writeDataToFile(String output, String data) {

		try (FileWriter fileWriter = new FileWriter(output)) {
			System.out.println("\nConverting String to Byte[] and writing to the file ...");

			char c[] = data.toCharArray();

			for (int i = 0; i < c.length; i++) {
				fileWriter.write(c[i]);
			}
			System.out.println("Data Saved Successfully !!!\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readDataFromFile(String output) {
		try (FileReader fileReader = new FileReader(output)) {
			System.out.println("Reading Data from the File ...");
			int ch;
			while ((ch = fileReader.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}