package com.corejavaprojects.serializationdeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDeserializeMain {

	static final String fileDetails = "D:\\eMexo\\MyWorkspaces\\Workspace_1\\CoreJavaProject\\src\\com\\corejavaprojects\\serializationdeserialization\\StatusProduct.der";

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Product product = new Product();

		product.setId(101);
		product.setName("ChatGPT");
		product.setPassword("Vande@124#");
		product.setType("Technology");
		product.setDescription("Trending AI Bot");

		System.out.println("Initiating Serialization !!!");
		serialize(product);
		System.out.println("Initiating DeSerialization !!!");
		Product persistedProduct = Deserialize();
		System.out.println("Printing Deserialized Object ----->>>>>");
		System.out.println(persistedProduct);
	}

	private static Product Deserialize() {
		Product product = null;

		try (FileInputStream fis = new FileInputStream(fileDetails);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			try {
				product = (Product) ois.readObject();
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return product;

	}

	private static void serialize(Product product) {
		try (FileOutputStream fos = new FileOutputStream(fileDetails);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(product);
			System.out.println("Object persisted in the file at location :  " + fileDetails);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
