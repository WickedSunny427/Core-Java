package com.corejavaprojects.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class InputStreamMain {

	public static void main(String[] args) {

		String output = "D:\\eMexo\\MyWorkspaces\\Workspace_1\\CoreJavaProject\\src\\com\\corejavaprojects\\iostream\\inputstream\\OutputFile.txt";

		InputStreamMain object = new InputStreamMain();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data to be stored in the file below : \n");

		String data = sc.nextLine();
		sc.close();

		object.writeDataToFile(output, data);
		object.readDataFromFile(output);
	}

	private void writeDataToFile(String output, String data) {

		try (FileOutputStream fileOutputStream = new FileOutputStream(output)) {
			System.out.println("\nConverting String to Byte[] and writing to the file ...");

			char c[] = data.toCharArray();

			for (int i = 0; i < c.length; i++) {
				fileOutputStream.write(c[i]);
			}
			System.out.println("Data Saved Successfully !!!\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readDataFromFile(String output) {
		try (FileInputStream fileInputStream = new FileInputStream(output)) {

			System.out.println("Reading Data from the File ...");
			int ch;
			while ((ch = fileInputStream.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}