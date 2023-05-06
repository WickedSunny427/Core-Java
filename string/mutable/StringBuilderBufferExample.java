package com.corejavaprojects.string.mutable;

import java.util.Scanner;

public class StringBuilderBufferExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");

		String input1 = sc.next();
		String input2 = sc.next();
		String input3 = sc.next();

		StringBuilderBufferExample object = new StringBuilderBufferExample();

		System.out.println("Using StingBuilder");
		System.out.println(object.displayStingBuilder(input1, input2, input3));

		System.out.println("\n" + "Using StingBuffer");
		System.out.println(object.displayStingBuffer(input1, input2, input3));
	}

	private String displayStingBuffer(String input1, String input2, String input3) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(input1);
		buffer.append(input2);
		buffer.append(input3);
		return buffer.toString();
	}

	private String displayStingBuilder(String input1, String input2, String input3) {
		StringBuilder builder = new StringBuilder();
		builder.append(input1);
		builder.append(input2);
		builder.append(input3);
		return builder.toString();
	}
}