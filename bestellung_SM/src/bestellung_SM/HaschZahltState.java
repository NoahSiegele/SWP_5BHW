package bestellung_SM;

public class HaschZahltState implements IState{

	@Override
	public void goNext(Context c) {
		if(c.isValid() == true) {
		c.setState(new WarenState());
		}
		else {
			c.setState(new ZahlState());
		}
		
	}

	@Override
	public void printMsg() {
		System.out.println("Hasch zahlt?");
	}

}
