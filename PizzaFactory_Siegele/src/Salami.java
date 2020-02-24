import java.util.Arrays;

public class Salami implements IPizza{
	private String name = "Salami";
	private String zutaten[] = {"Käse", "Salami", "Tomatensauce"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Salami() {
		
	}
	
	public Salami(String name, String[] zutaten) {
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
		return "Salami [name=" + name + ", zutaten=" + Arrays.toString(zutaten) + "]";
	}
	
	
	
	

}
