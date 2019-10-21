package calculator;

import java.util.HashMap;

@SuppressWarnings("unused")
public class AlgebraicProcessing {

	public static String Equate (String input) {
		
		String ordered = Parenthesize(input);
		
		return new String(calculate(ordered) + "");
	}
	
	private static String Parenthesize (String in) {
		
		
		return null;
	}
	
	private static double calculate(String ordered) {
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < ordered.length(); i++) {
			
		}
		
		return 0;
	}
	
	private static double add(double val1, double val2) {
		return val1 + val2;
	}
	
	private static double subtract(double val1, double val2) {
		return val1 - val2;
	}
	
	private static double multiply(double val1, double val2) {
		return val1 * val2;
	}
	
	private static double divide(double val1, double val2) {
		return val1 / val2;
	}
	
	private static double square(double val) {
		return val * val;
	}
	
	private static double root(double val) {
		return Math.sqrt(val);
	}
	
	private static double mod(double val1, double val2) {
		return val1 % val2;
	}
	
	private static double abs(double val) {
		if (val < 0) {
			return val * -1;
		} else {
			return val;
		}
	}
	
}
