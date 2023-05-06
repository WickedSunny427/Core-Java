package com.corejavaprojects.generics.rawtype;

//Generic class Box with type parameter T
class Box<T> {
	private T value;

	public Box(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
}

//Using Box class with raw type
public class RawTypeExample {
	public static void main(String[] args) {
		// Creating a Box object with raw type
		Box box = new Box("Hello"); // No type argument specified
		System.out.println("Raw Value : " + box);
		// Getting value from Box, which returns an Object
		Object value = box.getValue();
		System.out.println("Value: " + value);

		// Type casting is required to get the desired type
		String stringValue = (String) box.getValue();
		System.out.println("String value: " + stringValue);
	}
}
