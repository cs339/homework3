
public class StateFactory {
	public State getShape(String state) {
		if (state == null) {
			return null;
		}
		if (state.equalsIgnoreCase("STATE0")) {
			return State0.getInstance();

		} else if (state.equalsIgnoreCase("STATE1")) {
			return State1.getInstance();

		} else if (state.equalsIgnoreCase("STATE2")) {
			return State2.getInstance();

		} else if (state.equalsIgnoreCase("STATE3")) {
			return State3.getInstance();

		} else if (state.equalsIgnoreCase("STATE4")) {
			return State4.getInstance();

		} else if (state.equalsIgnoreCase("STATE5")) {
			return State5.getInstance();

		} else if (state.equalsIgnoreCase("STATEERROR")) {
			return StateError.getInstance();

		} 
		return null;
	}
}
