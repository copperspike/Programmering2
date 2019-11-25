package calculator;

public class OperatorReturn implements IStrategy {

	@Override
	/**
	 * This operator ignores num2, as the operator only uses one value
	 */
	public Double doOperation(Double num1, Double num2) {
		return num1;
	}

}
