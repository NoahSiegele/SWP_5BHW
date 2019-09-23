import java.util.ArrayList;

public class heizung {

	ArrayList<observer> Personen = new ArrayList<>();
	
	public void setValue(int value) {
		notifyAllObserver(value);
	}
	
	public void notifyAllObserver(int v) {
			for(int i = 0; i < Personen.size(); i++) {
				Personen.get(i).update(v);
			}
		
	}
	
	public void register(observer o) {
		if(!Personen.contains(o)) {
			Personen.add(o);
		}
	}
	
	public void unRegister(observer o) {
			Personen.remove(o);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
