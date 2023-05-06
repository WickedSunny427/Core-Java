package com.corejavaprojects.serializationdeserialization;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	static final String OWNER = "MODI JI";

	long id;
	String name;
	String type;
	String description;
	// String password;
	transient String password; // Will skip Serialization

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", description=" + description
				+ ", password=" + password + "]";
	}

}