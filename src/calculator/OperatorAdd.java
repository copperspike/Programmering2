package calculator;

public class OperatorAdd implements IStrategy{

	public Double doOperation(Double num1, Double num2) {
		return num1 + num2;
	}

}
