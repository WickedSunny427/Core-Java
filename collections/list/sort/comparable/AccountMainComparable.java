package com.corejavaprojects.collections.list.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

public class AccountMainComparable {

	public static void main(String[] args) {

		Account account1 = new Account();

		account1.setId(549);
		account1.setName("Sunny");
		account1.setOrganization("TCS");

		Account account2 = new Account();

		account2.setId(102);
		account2.setName("Ritesh");
		account2.setOrganization("Oracle");

		Account account3 = new Account();

		account3.setId(201);
		account3.setName("Nisha");
		account3.setOrganization("Emexo");

		List<Account> accounts = new ArrayList<>();
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);

		System.out.println("---- Before Sorting ----");
		if (!CollectionUtils.isEmpty(accounts)) {
			accounts.forEach(account -> System.out.println(account));
		}

		// Sorting the list using Comparable
		Collections.sort(accounts);

		System.out.println("---- After Sorting ----");
		if (!CollectionUtils.isEmpty(accounts)) {
			accounts.forEach(account -> System.out.println(account));
		}
	}
}