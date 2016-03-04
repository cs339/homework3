
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
		// TODO Auto-generated method stub

	}

}
