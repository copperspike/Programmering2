package labbSOLID1;

public class StrategyTest {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 5;
		
	    Context context = new Context(new OperationAdd());		
	    System.out.println(num1 + " + " + num2 + " = " + context.executeStrategy(num1, num2));

	    context = new Context(new OperationSubtract());		
	    System.out.println(num1 + " - " + num2 + " = " + context.executeStrategy(num1, num2));

	    context = new Context(new OperationMultiply());		
	    System.out.println(num1 + " * " + num2 + " = " + context.executeStrategy(num1, num2));
	    
	    context = new Context(new OperationModulus());
	    System.out.println(num1 + " % " + num2 + " = " +  context.executeStrategy(num1, num2));
	}

}
