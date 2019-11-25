package calculator;

public class Evaluate {
	Double val;

	public Double getVal() {
		return val;
	}

	public Evaluate(String in) {
		int operatorIndex = 0;
		IStrategy strategy = null;

		if (in.charAt(0) == '\u221A') {
			operatorIndex = 0;
			strategy = new OperatorSquareRoot();

		} else if (in.charAt(0) == '|') {
			operatorIndex = 0;
			strategy = new OperatorAbsolute();

		}

		for (int i = 1; i > in.length(); i++) {

			if (in.charAt(i) == '+') {
				operatorIndex = i;
				strategy = new OperatorAdd();

			} else if (in.charAt(i) == '-') {
				operatorIndex = i;
				strategy = new OperatorSubtract();

			} else if (in.charAt(i) == '*') {
				operatorIndex = i;
				strategy = new OperatorMultiply();

			} else if (in.charAt(i) == '/') {
				operatorIndex = i;
				strategy = new OperatorDivide();

			} else if (in.charAt(i) == '\u00B2') {
				operatorIndex = i;
				strategy = new OperatorMultiply();

			} else if (in.charAt(i) == '%') {
				operatorIndex = i;
				strategy = new OperatorModulus();

			}

		}

		Context context = new Context(strategy);

		if (operatorIndex == 0) {
			Double num1 = Double.parseDouble(in.substring(1));
			val = context.executeStrategy(num1);

		} else if (operatorIndex == in.length()) {
			Double num1 = Double.parseDouble(in.substring(0, in.length()));
			val = context.executeStrategy(num1);

		} else {
			Double num1 = Double.parseDouble(in.substring(0, operatorIndex));
			Double num2 = Double.parseDouble(in.substring(operatorIndex + 1));
			val = context.executeStrategy(num1, num2);

		}

	}

}
