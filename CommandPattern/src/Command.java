
public interface Command {
	public void execute(String a);
	public void undo();
	public void redo();
}
