
public class StateError implements State {
	// create an object of State0
	private static StateError instance = new StateError();

	// make the constructor private so that this class cannot be
	// instantiated
	private StateError() {
	}

	// Get the only object available
	public static StateError getInstance() {
		return instance;
	}

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub

	}

}
