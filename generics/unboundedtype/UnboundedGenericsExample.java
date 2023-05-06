package com.corejavaprojects.generics.unboundedtype;



public class UnboundedGenericsExample {
    public static void main(String[] args) {
        // Creating a Box with String value
        Box<String> strBox = new Box<>("Hello");
        strBox.display();

        // Creating a Box with Integer value
        Box<Integer> intBox = new Box<>(123);
        intBox.display();
    }
}
