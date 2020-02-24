
public class PizzaFactory {
	public static IPizza getPizza(String pizza) {
		if(pizza == "Margherita") {
			return new Margherita();
		}
		else if(pizza == "Salami") {
			return new Salami();
		}
		else if(pizza == "Diavolo") {
			return new Diavolo();
		}
		else
			return null;
	}
}
