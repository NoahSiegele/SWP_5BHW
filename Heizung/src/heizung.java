import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class heizung {

	Map<observer, Integer> t = new HashMap<observer, Integer>(); 
	int value;
	
	public void setValue(int v) {
		value = v;
		notifyAllObserver();
	}
	
	public void notifyAllObserver() {
			for(Entry<observer, Integer> e : t.entrySet()) {
				if(e.getValue() < value) {
					e.getKey().update(value);
				}
			}
		
	}
	
	public void register(observer o, int temp) {
		if(!t.containsKey(o)) {
			t.put(o, temp);
		}
	}
	
	public void unRegister(observer o) {
			t.remove(o);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
