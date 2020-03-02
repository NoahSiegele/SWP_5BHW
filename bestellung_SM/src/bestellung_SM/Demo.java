package bestellung_SM;

public class Demo {

	public static void main(String[] args) {
		Context c = new Context();
		c.getState().printMsg();
		c.getState().goNext(c);
		c.getState().printMsg();
	}
}
