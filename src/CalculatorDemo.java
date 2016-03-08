
public class CalculatorDemo {

	public static void main(String[] args) {
		Context context = new Context();
		StateFactory stateFactory = new StateFactory();
		context.setState(stateFactory.getShape("STATE0"));
		
		//TODO: Does the while loop go in here or the context?
		while(true){//TODO: set the while statement, based on some string
			//TODO: State transitions
		}
	}
}
