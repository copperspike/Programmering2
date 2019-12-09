package labbV50;

public class Dog extends Animal implements IWalk, ITricks, ISwim, IQuadrapedalMotion, ISkip {

	public Dog(String color) {
		super(color);
	}

	@Override
	public String getColor() {
		return super.getColor();
	}

	@Override
	public void setColor(String color) {
		super.setColor(color);
	}

	@Override
	void speak() {
		System.out.println("Dog is barking!");
	}

	@Override
	void sleep() {
		System.out.println("Dog is sleeping!");
	}

	@Override
	void eat() {
		System.out.println("Dog is eating.");
	}

	@Override
	public void trot() {
		System.out.println("Dog is a champion!");
	}

	@Override
	public void skip() {
		System.out.println("Dog is happy!");
	}

	@Override
	public void jump() {
		System.out.println("Dog is agile!");
	}

	@Override
	public void swim() {
		System.out.println("Dog is swimming!");
	}

	@Override
	public void run() {
		System.out.println("Dog running!");
	}

	@Override
	public void roll() {
		System.out.println("Who's a good boi!");
	}

	@Override
	public void sit() {
		System.out.println("Staaaaay!");
	}

	@Override
	public void dash() {
		System.out.println("Dog so fast!");
	}
}
