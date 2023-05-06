package com.corejavaprojects.collections.list.sort.comparator.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

public class AccountMainComparatorJava8 {

	public static void main(String[] args) {

		Account account1 = new Account();

		account1.setId(650);
		account1.setName("Gujan");
		account1.setOrganization("TCS");

		Account account2 = new Account();

		account2.setId(102);
		account2.setName("Divya");
		account2.setOrganization("Oracle");

		Account account3 = new Account();

		account3.setId(322);
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

		// Sorting the list using Java 8
		// Collections.sort(accounts, (acc1,acc2)->acc1.getName().compareTo(acc2.getName()));

		// Sorting the list using Java 8 Comparator comparing
		// Collections.sort(accounts,Comparator.comparing(Account::getOrganization));

		// Sorting the list using Java 8 Comparator comparing
		//accounts.sort(Comparator.comparing(acc -> acc.getId()));

		// Sorting the list using Java 8 Comparator comparing
		accounts.sort(Comparator.comparing(Account::getName));

		System.out.println("---- After Sorting using Java features ----");
		if (!CollectionUtils.isEmpty(accounts)) {
			accounts.forEach(account -> System.out.println(account));
		}
	}
}