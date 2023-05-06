package com.corejavaprojects.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Integer type
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        // Accessing elements from the ArrayList
        for (Integer num : numbers) {
            System.out.println(num);
        }
        
        numbers.stream().forEach(System.out::println);
    }
}
