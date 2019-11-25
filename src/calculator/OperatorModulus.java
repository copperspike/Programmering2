package calculator;

public class OperatorModulus implements IStrategy {

	@Override
	public Double doOperation(Double num1, Double num2) {
		return num1 % num2;
	}

}
