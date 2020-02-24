import java.util.Arrays;

public class Margherita implements IPizza{
	private String name = "Margherita";
	private String zutaten[] = {"Käse", "Tomatensauce"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Margherita() {
		
	}
	
	public Margherita(String name, String[] zutaten) {
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
		return "Margherita [name=" + name + ", zutaten=" + Arrays.toString(zutaten) + "]";
	}
	
}
