
public class Client {
	public static void main(String[] args) {
		Caller c = new Caller(new ConcreteCommand());
		c.start("Hallo");
		c.start("Hallo2");
		c.undo();
		c.redo();
	}
}
