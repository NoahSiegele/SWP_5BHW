package auto_observer;

public class Display implements Observer {
	
	@Override
	public void update(int rpm) {
		if(rpm >= 6500) {
			System.out.println("red");
		}
		else {
			System.out.println("green");
		}
	}
	
}
