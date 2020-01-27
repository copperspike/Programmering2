package calculator;

import java.util.ArrayList;

public class AlgebraicProcessing {

	static char[] allowedChars = { '\u221A', '\u00B2', '(', ')', '+', '-', '\u00D7', '\u00f7', '=', '|', '.', '%', 'C', '1',
			'2', '3', '4', '5', '6', '7', '8', '9', '0' };
	static char[] allowedOperators = {'\u221A', '\u00B2', '(', ')', '+', '-', '\u00D7', '\u00f7', '=', '|', '%', 'C'};

	public static String Equate(String input) {

		boolean error = false;

		for (char inputChar : input.toCharArray()) {
			boolean ok = false;

			for (char allow : allowedChars) {

				if (input.charAt(inputChar) == allow) {
					ok = true;
				}

			}

			if (!ok) {
				error = true;
			}

		}

		if (error) {

			return null;

		} else {
			Double[] values = stringToValueArray(input);
			Character[] operators = stringToOperatorArray(input);
			boolean valueFirst = true;


			// - CONTENT -

			return calculate(values, operators, valueFirst) + "";
		}
	}

	private static Character[] stringToOperatorArray(String input) {
		ArrayList<Character> operators = new ArrayList<Character>();


		Character[] output = new Character[operators.size()];

		return output;
	}

	private static Double[] stringToValueArray(String input) {
		ArrayList<Double> values = new ArrayList<Double>();



		Double[] output = new Double[values.size()];

		return output;
	}

	private static int search (String sub) {
		int index = -1;
		boolean found = false;
		for (int i = 0; i < sub.length(); i++) {
			for (int j = 0; j < allowedChars.length - 10; j++) {
				
				if (sub.charAt(i) == allowedChars[j]) {
					index = i;
					found = true;
					break;
				}
				
			}
			
			if (found) {
				break;
			}
			
		}
		
		return index;
	}

	private static Double calculate(Double[] values, Character[] operators, boolean valueFirst) {
		double val = 0;



		return val;
	}

}
