
public class Caller{
	Command command;
	
	public Caller(Command command) {
		this.command = command;
	}
	
	
	public Command getCommand() {
		return command;
	}


	public void setCommand(Command command) {
		this.command = command;
	}


	public void start(String a) {
		command.execute(a);
	}
	
	public void undo() {
		command.undo();
	}
	
	public void redo() {
		command.redo();
	}

}
