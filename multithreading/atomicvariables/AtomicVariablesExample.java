package com.corejavaprojects.multithreading.atomicvariables;

import java.util.concurrent.atomic.*;

public class AtomicVariablesExample {

    public static void main(String[] args) {

        // AtomicInteger Example
        AtomicInteger atomicInt = new AtomicInteger(0);
        int previousValue = atomicInt.getAndAdd(5);
        System.out.println("Atomic Integer: Previous value = " + previousValue + ", New value = " + atomicInt.get());

        // AtomicLong Example
        AtomicLong atomicLong = new AtomicLong(100);
        long previousLongValue = atomicLong.getAndSet(50);
        System.out.println("Atomic Long: Previous value = " + previousLongValue + ", New value = " + atomicLong.get());

        // AtomicBoolean Example
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        boolean previousBooleanValue = atomicBoolean.getAndSet(true);
        System.out.println("Atomic Boolean: Previous value = " + previousBooleanValue + ", New value = " + atomicBoolean.get());

        // AtomicReference Example
        AtomicReference<String> atomicReference = new AtomicReference<>("Initial Value");
        String previousReferenceValue = atomicReference.getAndSet("New Value");
        System.out.println("Atomic Reference: Previous value = " + previousReferenceValue + ", New value = " + atomicReference.get());

        // AtomicReferenceArray Example
        String[] array = {"one", "two", "three", "four", "five"};
        AtomicReferenceArray<String> atomicReferenceArray = new AtomicReferenceArray<>(array);
        String previousArrayValue = atomicReferenceArray.getAndSet(3, "fournew");
        System.out.println("Atomic Reference Array: Previous value = " + previousArrayValue + ", New value = " + atomicReferenceArray.get(3));

        // AtomicMarkableReference Example
        AtomicMarkableReference<String> atomicMarkableReference = new AtomicMarkableReference<>("Initial Value", true);
        boolean previousMarkableValue = atomicMarkableReference.isMarked();
        boolean result = atomicMarkableReference.compareAndSet("Initial Value", "New Value", true, false);
        System.out.println("Atomic Markable Reference: Previous value = " + previousMarkableValue + ", New value = " + atomicMarkableReference.getReference() + ", Result = " + result);

        // AtomicStampedReference Example
        AtomicStampedReference<String> atomicStampedReference = new AtomicStampedReference<>("Initial Value", 0);
        int previousStamp = atomicStampedReference.getStamp();
        boolean stampResult = atomicStampedReference.compareAndSet("Initial Value", "New Value", previousStamp, previousStamp + 1);
        System.out.println("Atomic Stamped Reference: Previous stamp = " + previousStamp + ", New value = " + atomicStampedReference.getReference() + ", Result = " + stampResult);

    }
}