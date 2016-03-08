
public class Context {
	private State state;
	public int total;
	public int subtotal;
	public char last;
	public String error;
	
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
