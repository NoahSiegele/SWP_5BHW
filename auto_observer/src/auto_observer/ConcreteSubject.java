package auto_observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
	ArrayList<Observer> os;
	int rpm;
	
	public void setRPM(int r) {
		rpm = r;
		notifyObserver();
	}
	
	public ConcreteSubject() {
		os = new ArrayList<Observer>();
	}
	
	@Override
	public void addObserver(Observer o) {
		os.add(o);	
	}

	@Override
	public void removeObserver(Observer o) {
		int pos = os.indexOf(o);
		os.remove(pos);
	}

	@Override
	public void notifyObserver() {
		for(Observer observer : os) {
			observer.update(rpm);
		}
	}

}
