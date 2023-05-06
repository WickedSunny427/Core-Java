package com.corejavaprojects.oops.polymorphism.assignment;

public class Customer implements ICustomer {

	@Override
	public void opensAccount(Bank rbi) {
		System.out.println("When you open account with us : ");
		rbi.fdInterestRate();
	}
}