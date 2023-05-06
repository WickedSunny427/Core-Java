package com.corejavaprojects.collections.map;

import java.util.Objects;

public class Address {
	private String address1;
	private String address2;
	private String City;
	private String State;

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void setCity(String city) {
		City = city;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", City=" + City + ", State=" + State + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(City, State, address1, address2);
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
		return Objects.equals(City, other.City) && Objects.equals(State, other.State)
				&& Objects.equals(address1, other.address1) && Objects.equals(address2, other.address2);
	}

}
