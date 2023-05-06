package com.corejavaprojects.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;

public class HashSetMain {

	public static void main(String[] args) {

		Address address1 = new Address();

		address1.setName("Bangalore");
		address1.setPin(560100);
		address1.setLandmark("near Emexo");

		Address address2 = new Address();

		address2.setName("Ranchi");
		address2.setPin(834003);
		address2.setLandmark("near Airport");

		Address address3 = new Address();

		address3.setName("Pune");
		address3.setPin(604584);
		address3.setLandmark("near Film City.");

		Address address4 = new Address();

		address4.setName("Pune");
		address4.setPin(604584);
		address4.setLandmark("near Film City.");

		Set<Address> addresses = new HashSet<>();
		addresses.add(address1);
		addresses.add(address2);
		addresses.add(address3);
		addresses.add(address4);

		HashSetMain obj = new HashSetMain();
		System.out.println("Size of set is : " + addresses.size());
		System.out.println("------------- Printing using ForEach loop -----------\n");
		obj.iterateUsingForEachLoop(addresses);
		System.out.println();

		System.out.println("------------- Printing using Lambda -----------\n");
		obj.iterateUsingLambda(addresses);
		System.out.println();

		System.out.println("------------- Printing using Iterator -----------\n");
		obj.iterateUsingIterator(addresses);
		System.out.println();

	}

	private void iterateUsingForEachLoop(Set<Address> addresses) {
		if (!CollectionUtils.isEmpty(addresses)) {
			for (Address address : addresses) {
				System.out.println(address);
			}
		}
	}

	private void iterateUsingLambda(Set<Address> addresses) {
		if (!CollectionUtils.isEmpty(addresses)) {
			addresses.forEach(item -> System.out.println(item));
		}
	}

	private void iterateUsingIterator(Set<Address> addresses) {
		if (!CollectionUtils.isEmpty(addresses)) {
			Iterator<Address> iterator = addresses.iterator();
			while (iterator.hasNext())
				System.out.println(iterator.next());
		}
	}

}
