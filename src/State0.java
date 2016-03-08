
public class State0 implements State {
	// create an object of State0
	private static State0 instance = new State0();

	// make the constructor private so that this class cannot be
	// instantiated
	private State0() {
	}

	// Get the only object available
	public static State0 getInstance() {
		return instance;
	}

	@Override
	public void doAction(Context context) {
		if(Character.isDigit(context.last)) {
			context.total += Character.getNumericValue(context.last);
			context.setState(State1.getInstance());
		} else {
			context.error = ("Error: First Character must be a digit [0-9].");
			context.setState(StateError.getInstance());
		}
	}

}
