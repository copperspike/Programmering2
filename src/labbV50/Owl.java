package labbV50;

public class Owl extends Bird implements ITricks, ISkip {

	public Owl(String color) {
		super(color);
	}

	@Override
	void move() {
		fly();
		skip();
		jump();
		roll();
		sit();
	}

	@Override
	String getName() {
		return "Its an owl!";
	}

	@Override
	public void fly() {
		System.out.println("Owl is gliding silently through the air!");
	}

	@Override
	public void skip() {
		System.out.println("Owl is skipping and hopping!");
	}

	@Override
	public void jump() {
		System.out.println("Owl is jumping!");
	}

	@Override
	public void roll() {
		System.out.println("Do a barrel roll!");
	}

	@Override
	public void sit() {
		System.out.println("Owl is squatting on dem eggs!");
	}

}
