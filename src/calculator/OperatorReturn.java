package calculator;

public class OperatorReturn implements IStrategy {

	@Override
	public Double doOperation(Double num1, Double num2) {
		return num1;
	}

}
