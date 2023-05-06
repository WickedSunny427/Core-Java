package com.corejavaprojects.multithreading.deadlock;

public class LiveLockExample {
    public static void main(String[] args) {
        final Object spoon1 = new Object();
        final Object spoon2 = new Object();

        Runnable person1 = () -> {
            while (true) {
                synchronized (spoon1) {
                    System.out.println("Person 1 has acquired spoon 1");
                    System.out.flush();
                    synchronized (spoon2) {
                        System.out.println("Person 1 has acquired spoon 2");
                        System.out.flush();
                        System.out.println("Person 1 is eating");
                        System.out.flush();
                    }
                }
            }
        };

        Runnable person2 = () -> {
            while (true) {
                synchronized (spoon2) {
                    System.out.println("Person 2 has acquired spoon 2");
                    System.out.flush();
                    synchronized (spoon1) {
                        System.out.println("Person 2 has acquired spoon 1");
                        System.out.flush();
                        System.out.println("Person 2 is eating");
                        System.out.flush();
                    }
                }
            }
        };

        new Thread(person1, "Person 1").start();
        new Thread(person2, "Person 2").start();
    }
}
