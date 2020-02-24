
public class context {
	IStrategy s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public context() {
		
	}
	
	public context(IStrategy s) {
		this.s = s;
	}
	
	public double execute(double x, double y) {
		return s.operator(x, y);
	}

}
