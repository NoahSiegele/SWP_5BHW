package bestellung_SM;

public class Context {
	private boolean valid = true;
	private IState state;
	
	public Context() {
		state = new HelloState();
	}
	
	public boolean isValid() {
		return valid;
	}
	
	public void setValid(boolean b) {
		valid = b;
	}

	public IState getState() {
		return state;
	}

	public void setState(IState state) {
		this.state = state;
	}
	
	

}
