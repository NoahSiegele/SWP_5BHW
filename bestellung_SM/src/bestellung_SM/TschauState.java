package bestellung_SM;

public class TschauState implements IState{

	@Override
	public void goNext(Context c) {
		c.setState(this);
		
	}

	@Override
	public void printMsg() {
		System.out.println("Tschau");
		
	}

}
