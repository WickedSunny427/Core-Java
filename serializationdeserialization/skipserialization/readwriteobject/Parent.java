package com.corejavaprojects.serializationdeserialization.skipserialization.readwriteobject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Parent implements Serializable {

	private static final long serialVersionUID = -6657354912685940100L;
	private String parentField1;
	private String parentField2;
	private Child child; // Child class as a property in Parent

	// Getters and Setters

	private void writeObject(ObjectOutputStream out) throws IOException {
		// Custom serialization logic
		out.writeObject(parentField1);
		out.writeObject(parentField2);
		// Skip serialization of Child object
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		// Custom deserialization logic
		parentField1 = (String) in.readObject();
		parentField2 = (String) in.readObject();
		// Skip deserialization of Child object
	}
}