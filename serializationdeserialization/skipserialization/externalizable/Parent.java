package com.corejavaprojects.serializationdeserialization.skipserialization.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Parent implements Externalizable {
	private String parentField1;
	private String parentField2;
	private Child child; // Child class as a property in Parent

	// Getters and Setters

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// Custom serialization logic
		out.writeObject(parentField1);
		out.writeObject(parentField2);
		// Skip serialization of Child object
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// Custom deserialization logic
		parentField1 = (String) in.readObject();
		parentField2 = (String) in.readObject();
		// Skip deserialization of Child object
	}
}