package hw3;

public class State5 implements State {
	// create an object of State0
	private static State5 instance = new State5();

	// make the constructor private so that this class cannot be
	// instantiated
	private State5() {
	}

	// Get the only object available
	public static State5 getInstance() {
		return instance;
	}

	@Override
	public void doAction(Context context) {
		if(Character.isDigit(context.last)) {
			context.total += context.subtotal;
			context.subtotal *= 10;
			context.subtotal += Character.getNumericValue(context.last);
			context.total -= context.subtotal;
		} else if(context.last == '+') {
			context.error = "Error: Statement cannot end with an operator [+-].";
			context.subtotal = 0;
			context.setState(State2.getInstance());
		} else if(context.last == '-') {
			context.error = "Error: Statement cannot end with an operator [+-].";
			context.subtotal = 0;
			context.setState(State3.getInstance());
		} else {
			context.error = "Error: Only digits [0-9] and operators [+-] are allowed.";
			context.setState(StateError.getInstance());
		}
	}

}
