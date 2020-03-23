package auto_observer;

public class Speaker implements Observer{
	
	@Override
	public void update(int rpm) {
		if(rpm >= 6500) {
			System.out.println("piieeeeppppssss");
		}
	}

}
