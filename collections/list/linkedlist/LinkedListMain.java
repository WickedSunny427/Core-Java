package com.corejavaprojects.collections.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.collections4.CollectionUtils;

import com.corejavaprojects.collections.list.Product;

public class LinkedListMain {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Sprite");
		product1.setDescription("A beverage item.");

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Ice Cream");
		product2.setDescription("A desert item.");

		Product product3 = new Product();
		product3.setId(3);
		product3.setName("Biryani");
		product3.setDescription("A main course item.");

		LinkedList<Product> products = new LinkedList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);

		LinkedListMain obj = new LinkedListMain();

		System.out.println("------------- Printing using For loop -----------\n");
		obj.iterateUsingForLoop(products);
		System.out.println();

		System.out.println("------------- Printing using ForEach loop -----------\n");
		obj.iterateUsingForEachLoop(products);
		System.out.println();

		System.out.println("------------- Printing using Lambda -----------\n");
		obj.iterateUsingLambda(products);
		System.out.println();

		System.out.println("------------- Printing using Iterator -----------\n");
		obj.iterateUsingIterator(products);
		System.out.println();

		System.out.println("------------- Printing using List Iterator -----------\n");
		obj.iterateUsingListIterator(products);
		System.out.println();

		System.out.println("------------- Printing using Index -----------\n");
		obj.iterateUsingIndex(products);
		System.out.println();

	}

	private void iterateUsingForLoop(LinkedList<Product> products) {
		if (!CollectionUtils.isEmpty(products)) {
			for (int i = 0; i < products.size(); i++) {
				System.out.println(products.get(i));
			}
		}
	}

	private void iterateUsingForEachLoop(List<Product> products) {
		if (!CollectionUtils.isEmpty(products)) {
			for (Product product : products) {
				System.out.println(product);
			}
		}
	}

	private void iterateUsingLambda(List<Product> products) {
		if (!CollectionUtils.isEmpty(products)) {
			products.forEach(item -> System.out.println(item));
		}
	}

	private void iterateUsingIterator(List<Product> products) {
		if (!CollectionUtils.isEmpty(products)) {
			Iterator<Product> iterator = products.iterator();
			while (iterator.hasNext())
				System.out.println(iterator.next());
		}
	}

	private void iterateUsingListIterator(List<Product> products) {
		if (!CollectionUtils.isEmpty(products)) {
			ListIterator<Product> listIterator = products.listIterator();

			System.out.println("Iterating forward first -->>>");
			while (listIterator.hasNext()) {
				System.out.println(listIterator.next());
			}
			System.out.println("Iterating backwards now  <<<-----");

			while (listIterator.hasPrevious()) {
				System.out.println(listIterator.previous());
			}
		}
	}

	private void iterateUsingIndex(List<Product> products) {
		if (!CollectionUtils.isEmpty(products)) {
			System.out.println(products.get(0));
			System.out.println(products.get(1));
			System.out.println(products.get(2));
		}
	}
}