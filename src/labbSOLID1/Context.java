package labbSOLID1;

public class Context {
	private IStrategy strategy;
	
	public Context(IStrategy iStrategy) {
		strategy = iStrategy;
	}
	
	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}
