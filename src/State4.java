
public class State4 implements State {
	// create an object of State0
	private static State4 instance = new State4();

	// make the constructor private so that this class cannot be
	// instantiated
	private State4() {
	}

	// Get the only object available
	public static State4 getInstance() {
		return instance;
	}

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub

	}

}
