package com.corejavaprojects.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;

public class HashSetStringMain {

	public static void main(String[] args) {

		Set<String> players = new HashSet<>();
		players.add("Dhoni");
		players.add("Rishabh");
		players.add("Kohli");

		HashSetStringMain obj = new HashSetStringMain();

		System.out.println("------------- Printing using ForEach loop -----------\n");
		obj.iterateUsingForEachLoop(players);
		System.out.println();

		System.out.println("------------- Printing using Lambda -----------\n");
		obj.iterateUsingLambda(players);
		System.out.println();

		System.out.println("------------- Printing using Iterator -----------\n");
		obj.iterateUsingIterator(players);
		System.out.println();

	}

	private void iterateUsingForEachLoop(Set<String> players) {
		if (!CollectionUtils.isEmpty(players)) {
			for (String player : players) {
				System.out.println(player);
			}
		}
	}

	private void iterateUsingLambda(Set<String> players) {
		if (!CollectionUtils.isEmpty(players)) {
			players.forEach(item -> System.out.println(item));
		}
	}

	private void iterateUsingIterator(Set<String> players) {
		if (!CollectionUtils.isEmpty(players)) {
			Iterator<String> iterator = players.iterator();
			while (iterator.hasNext())
				System.out.println(iterator.next());
		}
	}

}
