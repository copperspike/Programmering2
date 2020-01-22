package labbV50;

public abstract class Bird extends Animal implements IFly{

	public Bird(String color) {
		super(color);
	}

	void speak() {
		System.out.println("Bird is chirping!");
	}

	void sleep() {
		System.out.println("Bird is sleeping!");
	}

	void eat() {
		System.out.println("Bird is peck-peck-pecking away!");
	}

}
