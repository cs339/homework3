
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
		// TODO Auto-generated method stub

	}

}
