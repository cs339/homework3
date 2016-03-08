
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
		// TODO Auto-generated method stub

	}

}
