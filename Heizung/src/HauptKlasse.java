
public class HauptKlasse {

	public static void main(String[] args) {
		elias e = new elias();
		noah n = new noah();
		heizung h = new heizung();
		h.register(n, 20);
		h.register(e, 35);
		h.setValue(30);
		
	}

}
