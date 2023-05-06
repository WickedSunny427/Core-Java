package com.corejavaprojects.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8FeaturesExample {
    public static void main(String[] args) {
        
        // Lambdas
        System.out.println("LAMBDA EXPRESSIONS:");
        List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve");
        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(names);

        // Method References
        System.out.println("\nMETHOD REFERENCES:");
        List<Integer> numbers = Arrays.asList(5, 3, 8, 6, 2, 7);
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        // Streams
        System.out.println("\nSTREAMS:");
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> filteredFruits = fruits.stream()
                                           .filter(fruit -> fruit.startsWith("b"))
                                           .collect(Collectors.toList());
        System.out.println(filteredFruits);

        // Optional
        System.out.println("\nOPTIONAL:");
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        String result = Stream.ofNullable(str)
                              .flatMapToInt(CharSequence::chars)
                              .mapToObj(i -> Character.toString((char) i))
                              .collect(Collectors.joining("-"));
        System.out.println("Result String: " + result);

        
        //DATE AND TIME API
        System.out.println("\nDATE AND TIME API:");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = now.format(formatter);
        System.out.println(formatted);

        //COMPLETABLE FUTURE
        System.out.println("\nCOMPLETABLE FUTURE");
        CompletableFuture.supplyAsync(() -> "Hello")
        .thenApply(s -> s + " World")
        .thenAccept(System.out::println);

        
        // Default Methods
        System.out.println("\nDEFAULT METHODS:");
        Printable printable = new Printable() {
            // Override only one method
            @Override
            public void print() {
                System.out.println("Printing from Printable implementation");
            }
        };
        printable.print();
        printable.log();
        
        
    }
    
    
}

interface Printable {
    default void print() {
        System.out.println("Printing from Printable interface");
    }

    default void log() {
        System.out.println("Logging from Printable interface");
    }
}
