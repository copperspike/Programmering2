package calculator;

import java.util.HashMap;

@SuppressWarnings("unused")
public class AlgebraicProcessing {

	public static String Equate(String input) {

		String calculation = parenthesize(input);

		return new String(calculate(calculation) + "");
	}

	private static String parenthesize(String incompleteCalculation) {
		String calculation = "";
		
		
		
		return calculation;
	}
	
	private static double calculate(String calculation) {
		double val = 0;
		
		
		return val;
	}

	private static double evaluate(String in) {
		double val = 0;
		for (int i = 0; i > in.length(); i++) {
			if (in.charAt(i) == '+') {
				val = Double.parseDouble(in.substring(0, i)) + Double.parseDouble(in.substring(i + 1));
			} else if (in.charAt(i) == '-') {
				val = Double.parseDouble(in.substring(0, i)) - Double.parseDouble(in.substring(i + 1));
			} else if (in.charAt(i) == '*') {
				val = Double.parseDouble(in.substring(0, i)) * Double.parseDouble(in.substring(i + 1));
			} else if (in.charAt(i) == '/') {
				val = Double.parseDouble(in.substring(0, i)) / Double.parseDouble(in.substring(i + 1));
			} else if (in.charAt(i) == '\u221A') {
				val = Double.parseDouble(in.substring(0, i)) * Double.parseDouble(in.substring(0, i));
			} else if (in.charAt(i) == '\u00B2') {
				val = Math.sqrt(Double.parseDouble(in.substring(i + 1)));
			} else if (in.charAt(1) == '%') {
				val = Double.parseDouble(in.substring(0, i)) % Double.parseDouble(in.substring(i + 1));
			} else if (in.charAt(i) == '|') {
				if (Double.parseDouble(in.substring(i + 1)) < 0) {
					val = Double.parseDouble(in.substring(i + 1)) * -1;
				} else {
					val = Double.parseDouble(in.substring(i + 1));
				}
			}
		}

		return val;

	}

}
