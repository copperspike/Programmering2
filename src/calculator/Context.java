package calculator;

public class Context {
	private IStrategy strategy;
	
	public Context(IStrategy iStrategy) {
		strategy = iStrategy;
	}
	
	public Double executeStrategy(Double num1) {
		return strategy.doOperation(num1, num1);
	}
	
	public Double executeStrategy(Double num1, Double num2) {
		return strategy.doOperation(num1, num2);
	}

}
