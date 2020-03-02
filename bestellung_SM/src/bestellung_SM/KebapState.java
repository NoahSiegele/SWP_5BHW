package bestellung_SM;

public class KebapState implements IState {

	@Override
	public void goNext(Context c) {
		c.setState(new PreisState());
		
	}

	@Override
	public void printMsg() {
		System.out.println("Kebap");
		
	}

}
