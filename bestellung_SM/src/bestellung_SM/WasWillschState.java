package bestellung_SM;

public class WasWillschState implements IState{

	@Override
	public void goNext(Context c) {
		if(c.isValid() == true) {
		c.setState(new KebapState());
		}
		else {
			c.setState(new HelloState());
		}
	}

	@Override
	public void printMsg() {
		System.out.println("Was willsch?");
	}
}
