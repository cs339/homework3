
public class State3 implements State {
	// create an object of State0
	private static State3 instance = new State3();

	// make the constructor private so that this class cannot be
	// instantiated
	private State3() {
	}

	// Get the only object available
	public static State3 getInstance() {
		return instance;
	}

	@Override
	public void doAction(Context context) {
		if(Character.isDigit(context.last)) {
			context.error = "";
			context.subtotal += Character.getNumericValue(context.last);
			context.total -= context.subtotal;
			context.setState(State5.getInstance());
		} else if (context.last == '+' || context.last == '-'){
			context.error = "Error: You cannot have two operators [+-] in a row.";
			context.setState(StateError.getInstance());
		} else {
			context.error = "Error: Only digits [0-9] and operators [+-] are allowed.";
			context.setState(StateError.getInstance());
		}
	}

}
