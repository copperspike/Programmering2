package labbSOLID2;

public abstract class Animal {

	private String _color;

	public Animal(String color) {
		_color = color;
	}

	public String getColor() {
		return _color;
	}

	public void paint(String color) {
		_color = color;
	}

	abstract void speak();

	abstract void sleep();

	abstract void eat();

	abstract void walk();

}
