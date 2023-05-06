package com.corejavaprojects.collections.set;

import java.util.Objects;

public class Address {
	private String name;
	private long pin;
	private String landmark;

	public String getName() {
		return name;
	}

	public long getPin() {
		return pin;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", pin=" + pin + ", landmark=" + landmark + "]";
	}

	@Override
	public int hashCode() {
		final int RANDOM = 101;
		int temp = 1;
		return temp = (int) (RANDOM * temp * getPin());

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(name, other.name);
	}

}