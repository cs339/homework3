
public class State1 implements State {
	// create an object of State0
	private static State1 instance = new State1();

	// make the constructor private so that this class cannot be
	// instantiated
	private State1() {
	}

	// Get the only object available
	public static State1 getInstance() {
		return instance;
	}

	@Override
	public void doAction(Context context) {
		if(Character.isDigit(context.last)) {
			context.total *= 10;
			context.total += Character.getNumericValue(context.last);
			context.setState(State1.getInstance());
		} else if(context.last == '+') {
			context.setState(State2.getInstance());
		} else if(context.last == '-') {
			context.setState(State3.getInstance());
		} else {
			context.error = "E1";
			context.setState(StateError.getInstance());
		}
	}

}
