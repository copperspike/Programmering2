package calculator;

@SuppressWarnings("unused")
public class AlgebraicProcessing {

	public static String Equate(String input) {
		
		boolean error = false;
		char[] allowedChars = {
				'\u221A', '\u00B2', '(', ')', '+', '-', '\u00D7', '\u00f7', '1', '2', '3', '%', '4',
				'5', '6', '|', '7', '8', '9', 'C', '.', '0', '='
		};
		
		for (char inputChar: input.toCharArray()) {
			boolean ok = false;
			
			for (char allow: allowedChars)
			{
				if (input.charAt(inputChar) == allow) {ok = true;}
			}
			if (!ok) {error= true;}
		}
		
		if (error) {
			
			return null;
			
		} else {
			String calculation = parenthesize(input);

			return new String(calculate(calculation) + "");
		}
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
