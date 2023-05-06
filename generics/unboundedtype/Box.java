package com.corejavaprojects.generics.unboundedtype;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}