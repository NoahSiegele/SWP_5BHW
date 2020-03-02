package bestellung_SM;

public class WarenState implements IState{

	@Override
	public void goNext(Context c) {
		c.setState(new TschauState());
		
	}

	@Override
	public void printMsg() {
		System.out.println("Da");
		
	}

}
