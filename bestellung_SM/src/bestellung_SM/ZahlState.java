package bestellung_SM;

public class ZahlState implements IState{

	@Override
	public void goNext(Context c) {
		c.setState(new WarenState());
		
	}

	@Override
	public void printMsg() {
		System.out.println("Machsch 4e");
		
	}
	
}
