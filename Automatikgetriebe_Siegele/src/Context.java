
public class Context {
	
	private Strategy st;
	
	public Context(Strategy strategy){
	      this.st = strategy;
	   }
	
	public void execute(int kw, boolean turbo, int rpm) {
		st.shift(kw,turbo,rpm);
	}        
}
