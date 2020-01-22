package labbV50;

public class Duck extends Bird implements IFly, ISwim, ITricks, IWalk {

	public Duck(String color) {
		super(color);
	}

	@Override
	void move() {
		fly();
		jump();
		swim();
		roll();
		sit();
		run();
		dash();
	}

	@Override
	String getName() {
		return "Its a duck!";
	}

	@Override
	public void fly() {
		System.out.println("Duck is soaring majestically!");
	}

	@Override
	public void jump() {
		System.out.println("Duck is jumping!");
	}

	@Override
	public void swim() {
		System.out.println("Duck is zooming like a speed boat!");
	}

	@Override
	public void run() {
		System.out.println("Duck is running for takeoff!");
	}

	@Override
	public void dash() {
		System.out.println("Duck is establishing dominance");
	}

	@Override
	public void roll() {
		System.out.println("Duck is good boi!");
	}

	@Override
	public void sit() {
		System.out.println("Duck is squatting on dem eggs!");
	}

}
