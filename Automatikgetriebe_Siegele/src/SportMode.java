
public class SportMode implements Strategy{

	@Override
	public void shift(int kw, boolean turboCharged, int rpm) {
		if(turboCharged == true) {
			if(rpm > 6000) {
				System.out.println("nächster Gang!");
			}
			else if(rpm < 3700){
				System.out.println("Gang runter!");
			}
		}
		else {
			if(kw > 160 && rpm > 7200) {
				System.out.println("nächster Gang!");
			}
			else if(kw > 160 && rpm < 3500){
				System.out.println("Gang runter!");
			}
			else if(kw < 160 && rpm > 6800) {
				System.out.println("nächster Gang!");
			}
			else if(kw < 160 && rpm < 3800) {
				System.out.println("Gang runter!");
			}
		}
	}
}
