package com.corejavaprojects.generics.boundedtype;


public class BoundedGenericsExample {
    public static void main(String[] args) {
        // Creating a Box with Integer value
        Box<Integer> intBox = new Box<>(10);
        intBox.display();

        // Creating a Box with Double value
        Box<Double> doubleBox = new Box<>(3.14);
        doubleBox.display();
    }
}
