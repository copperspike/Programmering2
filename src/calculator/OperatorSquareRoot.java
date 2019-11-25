package calculator;

public class OperatorSquareRoot implements IStrategy {

	@Override
	/**
	 * This operator ignores num2, as the operator precedes the value it is operating on
	 */
	public Double doOperation(Double num1, Double num2) {
		return Math.sqrt(num1);
	}

}
