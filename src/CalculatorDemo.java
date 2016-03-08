import java.util.Scanner;


public class CalculatorDemo {

	public static void main(String[] args) {
		Context context = new Context();
		StateFactory stateFactory = new StateFactory();
		context.setState(stateFactory.getShape("STATE0"));
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Expression: ");
		String expression = scan.nextLine();
		scan.close();
		for(char c : expression.toCharArray()) {
			context.last = c;
			context.getState().doAction(context);
		    if(context.getState() == StateError.getInstance()) {
		    	context.getState().doAction(context);
		    	break;
		    }
		}
		if(context.getState() != StateError.getInstance()) {
			System.out.println("Total: " + context.total);
		}
	}
}
