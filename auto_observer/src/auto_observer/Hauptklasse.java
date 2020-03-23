package auto_observer;

public class Hauptklasse {

	public static void main(String[] args) {
		Speaker s = new Speaker();
		Display d = new Display();
		ConcreteSubject cs = new ConcreteSubject();
		cs.addObserver(s);
		cs.addObserver(d);
		cs.setRPM(6500);
	}

}
