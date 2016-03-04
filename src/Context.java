
public class Context {
	private State state;
	public int total;
	
	public Context(){
		state = null;
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public State getState(){
		return state;
	}
}
