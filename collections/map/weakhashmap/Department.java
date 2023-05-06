package com.corejavaprojects.collections.map.weakhashmap;

public class Department {
	String name;
	String hod;

	public Department(String name, String hod) {
		super();
		this.name = name;
		this.hod = hod;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", hod=" + hod + "]";
	}

}
