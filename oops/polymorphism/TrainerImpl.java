package com.corejavaprojects.oops.polymorphism;

public class TrainerImpl implements ITrainer {

	@Override
	public void trains(Animal animal) {
		System.out.println("Trainer trains animal");
		animal.move();
	}

}
