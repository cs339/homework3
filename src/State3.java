
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
			context.subtotal += Character.getNumericValue(context.last);
			context.total -= context.subtotal;
			context.setState(State5.getInstance());
		} else {
			context.error = "E3";
			context.setState(StateError.getInstance());
		}
	}

}
