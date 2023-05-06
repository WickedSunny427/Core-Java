package com.corejavaprojects.generics.wildcard;

import java.util.List;

public class WildcardGenericsExample {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        // Creating a List of Strings
        List<String> strings = List.of("Hello", "World", "Java");

        // Creating a List of Integers
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Passing Lists of different types to printList method
        printList(strings);
        printList(numbers);
    }
}
