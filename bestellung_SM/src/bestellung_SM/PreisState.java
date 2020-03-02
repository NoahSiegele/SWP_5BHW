package bestellung_SM;

public class PreisState implements IState{

	@Override
	public void goNext(Context c) {
		if(c.isValid() == true) {
		c.setState(new HaschZahltState());
		}
		else {
			c.setState(new HelloState());
		}
	}

	@Override
	public void printMsg() {
		System.out.println("4,20€");
		
	}
	
}
