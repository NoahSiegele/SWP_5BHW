
public class ComfortMode implements Strategy{

	@Override
	public void shift(int kw, boolean turboCharged, int rpm) {
		if(turboCharged == true) {
			if(kw > 160 && rpm > 2300) {
				System.out.println("nächster Gang!");
			}
			else if (kw < 160 && rpm > 2550) {
				System.out.println("nächster Gang!");
			}
			else if(rpm < 1100) {
				System.out.println("Gang runter!");
			}
		}
		else {
			if(kw > 160 && rpm > 2600) {
				System.out.println("nächster Gang!");
			}
			else if (kw < 160 && rpm > 2900) {
				System.out.println("nächster Gang!");
			}
			else if(rpm < 1400) {
				System.out.println("Gang runter!");
			}
		}
	}

}
