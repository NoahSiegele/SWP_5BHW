
public class SchnitzelBeilage extends SchnitzelDekorierer {
	private Beilagen b;
	
	public SchnitzelBeilage(Schnitzelwirt s, Beilagen b) {
		super(s);
		this.b = b;
	}
	
	@Override
	public double getPrice() {
		if(b == Beilagen.Kartoffel) {
			return s.getPrice() + 4.0;
		}
		else if(b == Beilagen.Pommes) {
			return s.getPrice() + 4.0;
		}
		else if(b == Beilagen.Ketchup) {
			return s.getPrice() + 0.50;
		}
		else if(b == Beilagen.Mayonaise) {
			return s.getPrice() + 0.50;
		}
		else if(b == Beilagen.Salat) {
			return s.getPrice() + 3.50;
		}
		else {
			return s.getPrice();
		}	
	}

	@Override
	public String desc() {
		if(b == Beilagen.Kartoffel) {
			return s.desc() + ", Kartoffel";
		}
		else if(b == Beilagen.Pommes) {
			return s.desc() + ", Pommes";
		}
		else if(b == Beilagen.Ketchup) {
			return s.desc() + ", Ketchup";
		}
		else if(b == Beilagen.Mayonaise) {
			return s.desc() + ", Mayonaise";
		}
		else if(b == Beilagen.Salat) {
			return s.desc() + ", Salat";
		}
		else {
			return s.desc();
		}
	}

}
