package com.corejavaprojects.oops.polymorphism;

public class AnimalMain {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal fish = new Fish();
		Animal snake = new Snake();

		ITrainer trainer = new TrainerImpl();
		trainer.trains(dog);
		trainer.trains(fish);
		trainer.trains(snake);

	}
}