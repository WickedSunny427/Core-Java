package com.corejavaprojects.java8.stream.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsDemo {
	public static void main(String[] args) {
		// Create a list of integers
		List<Integer> numbers = Arrays.asList(5, 3, 8, 6, 2, 1, 2, 6, 4, 9, 5, 37);
		System.out.println("Original List : " + numbers);

		// Intermediate Operations
		System.out.println("\nINTERMEDIATE OPERATIONS:");

		// filter() - get even numbers
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers: " + evenNumbers);

		// map() - convert to string
		List<String> numberStrings = numbers.stream().map(n -> "Number: " + n).collect(Collectors.toList());
		System.out.println("Number Strings: " + numberStrings);

		// sorted() - sort the numbers
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Numbers: " + sortedNumbers);

		// distinct() - get unique numbers
		List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique Numbers: " + uniqueNumbers);

		// limit() - get first three numbers
		List<Integer> firstThreeNumbers = numbers.stream().limit(3).collect(Collectors.toList());
		System.out.println("First Three Numbers: " + firstThreeNumbers);

		// skip() - skip first three numbers
		List<Integer> skipFirstThreeNumbers = numbers.stream().skip(3).collect(Collectors.toList());
		System.out.println("Skip First Three Numbers: " + skipFirstThreeNumbers);

		// peek() - print each number
		numbers.stream().peek(n -> System.out.println("Peeked Number: " + n)).collect(Collectors.toList());

		// Terminal Operations
		System.out.println("\nTERMINAL OPERATIONS:");

		// forEach() - print each number
		System.out.println("Printing each number:");
		numbers.stream().forEach(n -> System.out.println(n));

		// count() - count the numbers
		long count = numbers.stream().count();
		System.out.println("Count of Numbers: " + count);

		// anyMatch() - check if any number is even
		boolean anyEvenNumber = numbers.stream().anyMatch(n -> n % 2 == 0);
		System.out.println("Any Even Number: " + anyEvenNumber);

		// allMatch() - check if all numbers are even
		boolean allEvenNumbers = numbers.stream().allMatch(n -> n % 2 == 0);
		System.out.println("All Even Numbers: " + allEvenNumbers);

		// noneMatch() - check if no number is negative
		boolean noneNegativeNumbers = numbers.stream().noneMatch(n -> n < 0);
		System.out.println("None Negative Numbers: " + noneNegativeNumbers);

		// findFirst() - get the first number
		Integer firstNumber = numbers.stream().findFirst().orElse(null);
		System.out.println("First Number: " + firstNumber);

		// findAny() - get any number
		Integer anyNumber = numbers.stream().findAny().orElse(null);
		System.out.println("Any Number: " + anyNumber);

		// reduce() - get the sum of the numbers
		Integer sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Sum of Numbers : " + sum);

		// peeking again
		numbers.stream().peek(n -> System.out.println("nonsense Number: " + n * n * n)).collect(Collectors.toList());
		System.out.println("Original List : " + numbers);

		// Distinct count
		long distinctCount = numbers.stream().distinct().count();
		System.out.println("Distinct count : " + distinctCount);

	}
}