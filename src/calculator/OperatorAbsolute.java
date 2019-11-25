package calculator;

public class OperatorAbsolute implements IStrategy {

	@Override
	/**
	 * This operator ignores num2, as the operator precedes the value it is operating on
	 */
	public Double doOperation(Double num1, Double num2) {
		if (num1 > 0) {
			return num1;
		} else {
			return num1 * -1;
		}
	}

}
