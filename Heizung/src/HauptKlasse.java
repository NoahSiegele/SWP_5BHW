
public class HauptKlasse {

	public static void main(String[] args) {
		elias e = new elias();
		noah n = new noah();
		heizung h = new heizung();
		h.register(n);
		h.register(e);
		h.setValue(30);
		
	}

}
