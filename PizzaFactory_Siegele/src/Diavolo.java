import java.util.Arrays;

public class Diavolo implements IPizza {
	private String name = "Diavolo";
	private String zutaten[] = {"Käse", "scharfe Salami", "Tomatensauce"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Diavolo() {
		
	}
	
	public Diavolo(String name, String[] zutaten) {
		super();
		this.name = name;
		this.zutaten = zutaten;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String[] getZutaten() {
		// TODO Auto-generated method stub
		return zutaten;
	}

	@Override
	public String toString() {
		return "Diavolo [name=" + name + ", zutaten=" + Arrays.toString(zutaten) + "]";
	}
	
}
