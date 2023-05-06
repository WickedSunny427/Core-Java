package com.corejavaprojects.method;

public class Product {

	private static String COLOR = "Black";
	private String code;
	private String name;

	public Product() {
		this.code = "PR#1234";
		this.name = "Dummy";
	}

	public Product(String code, String name) {
		this.code = code;
		this.name = name;
	}

	private static String getColor() {
		return Product.COLOR;
	}

	public static void main(String[] args) {
		Product product = new Product();
		Product product1 = new Product("PR#4702", "Mobile");

		System.out.println(Product.getColor());
		System.out.println(product.code);
		System.out.println(product.name);

		System.out.println(product1.code);
		System.out.println(product1.name);

	}

}