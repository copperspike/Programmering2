package labbV50;

public class Hedgehog extends Animal implements IWalk, ISkip, IQuadrapedalMotion, ISwim, ITricks {

	public Hedgehog(String color) {
		super(color);
	}

	@Override
	void speak() {
		System.out.println("Hedgehog is squeeking!");
	}

	@Override
	void sleep() {
		System.out.println("Hedgehog is napping!");
	}

	@Override
	void eat() {
		System.out.println("Hedgehog is omnomnoming!");
	}

	@Override
	void move() {
		trot();
		skip();
		swim();
		run();
		roll();
		sit();
		jump();
		dash();
	}

	@Override
	String getName() {
		return "Sonic?";
	}

	@Override
	public void trot() {
		System.out.println("Hedgehog is trotting!");
	}

	@Override
	public void skip() {
		System.out.println("Hedgehog is skipping and hopping!");
	}

	@Override
	public void swim() {
		System.out.println("Hedgehog is stalking snaek!");
	}

	@Override
	public void run() {
		System.out.println("Running around at the speed of sound!");
	}

	@Override
	public void roll() {
		System.out.println("Sonic is rolling so fast!");
	}

	@Override
	public void sit() {
		System.out.println("Hedgehog sitting for tea!");
	}

	@Override
	public void jump() {
		System.out.println("Spring noises intensify");
	}

	@Override
	public void dash() {
		System.out.println("Sonic the speedster!");
	}
}
