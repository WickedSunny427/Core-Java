package com.corejavaprojects.generics.boundedtype;


public class Box<T extends Number> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}