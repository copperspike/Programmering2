package labbV50;

import java.awt.*;

public class Main   {

	public static void main(String[] args) {

		Animal[] animals = {new Dog("Black"),
				new Hedgehog("Blue"),
				new Duck("Yellow"),
				new Owl("Brown"),
				new Snake("Black and Yellow")};

		System.out.println("###############");
		System.out.println();

		activateAnimal(animals);
	}

	private static void activateAnimal(Animal[] animals) {
		for (Animal animal : animals) {
			animal.eat();
			animal.sleep();
			animal.speak();
			animal.setColor("Grey");
			printAnimalName(animal);
			System.out.println();

			move(animal);

			System.out.println("###############");
			System.out.println();
		}
	}

	private static void printAnimalName(Animal animal) {
		System.out.println(animal.getName());
	}

	private static void move(Animal animal) {
		animal.move();
	}
}
