
public class demo {

	public static void main(String[] args) {
		Schnitzel s = new Schnitzel();
		Schnitzelwirt w = new SchnitzelBeilage(s, Beilagen.Kartoffel);
		Schnitzelwirt f = new SchnitzelBeilage(w, Beilagen.Ketchup);
		System.out.println(f.desc());
		System.out.println(f.getPrice());

	}

}
