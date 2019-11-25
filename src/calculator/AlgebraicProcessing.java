package calculator;

@SuppressWarnings("unused")
public class AlgebraicProcessing {

	static char[] allowedChars = { '\u221A', '\u00B2', '(', ')', '+', '-', '\u00D7', '\u00f7', '=', '|', '.', '%', 'C', '1',
			'2', '3', '4', '5', '6', '7', '8', '9', '0' };

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
			String calculation = parenthesize(input);

			return new String(calculate(calculation) + "");
		}
	}

	private static String parenthesize(String incompleteCalculation) {
		
		String calculation = "(" + incompleteCalculation.substring(0, search(incompleteCalculation));
		
		
		
		return calculation;
	}

	private static int search (String sub) {
		int index = sub.length() - 1;
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

	private static Double calculate(String calculation) {
		double val = 0;

		return val;
	}

}
