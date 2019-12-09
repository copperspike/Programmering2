package labbV50;

public class Snake extends Animal implements ITricks, ISwim {

	public Snake(String color) {
		super(color);
	}

	void speak() {
		System.out.println("Snake is hissing!");
	}

	void sleep() {
		System.out.println("Snake is sleeping!");
	}

	void eat() {
		System.out.println("Snake is devouring!");
	}

	@Override
	public void setColor(String color)
	{
		if (color.equals("Grey"))
		{
			return;
		}

		super.setColor("Black");
	}

	public void slither() {
		System.out.println("Snake is slithering!");
	}

	@Override
	public void jump() {
		System.out.println("Snake is shooting off the ground to bite you with his mouth needles!");
	}

	@Override
	public void swim() {
		System.out.println("Snake is swimming");
	}

	@Override
	public void roll() {
		System.out.println("Snake is rolling over!");
	}

	// Buuullshit "sit is not applicable"
	@Override
	public void sit() {
		System.out.println("Snake coils up");
	}

}
