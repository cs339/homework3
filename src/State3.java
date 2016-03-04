
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
		// TODO Auto-generated method stub

	}

}
