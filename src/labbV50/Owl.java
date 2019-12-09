package labbV50;

public class Owl extends Bird implements ITricks, ISkip {

	public Owl(String color) {
		super(color);
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
		//not applicable!
	}

	@Override
	public void sit() {
		System.out.println("Owl is squatting on dem eggs!");
	}

}
