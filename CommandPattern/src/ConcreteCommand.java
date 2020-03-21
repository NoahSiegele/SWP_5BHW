
public class ConcreteCommand implements Command{
	Stack1 stack;
	@Override
	public void execute(String a) {
		Stacks.stack.stackPush(a);	
	}

	@Override
	public void undo() {
		Stacks.stack.stackPop();
		
	}

	@Override
	public void redo() {
		Stacks.stack.stackPush(Stacks.stack.stackPeek());
		
	}
	
}
