package bestellung_SM;

public class HelloState implements IState{

	@Override
	public void goNext(Context c) {
		c.setState(new WasWillschState());
	}

	@Override
	public void printMsg() {
		System.out.println("Griaß di");
	}

}
