
public class State2 implements State {
	// create an object of State0
	private static State2 instance = new State2();

	// make the constructor private so that this class cannot be
	// instantiated
	private State2() {
	}

	// Get the only object available
	public static State2 getInstance() {
		return instance;
	}

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub

	}

}