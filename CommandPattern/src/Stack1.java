import java.util.Stack;

public class Stack1 {
	Stack<String> stack;
	public Stack1() {
		stack = new Stack<String>();
	}
	
	void stackPush(String a) {
		stack.push(a);
	}
	
	void stackPop() {
		stack.pop();
	}
	
	String stackPeek() {
		return stack.peek();
	}
	
	String stackSearch(String a) {
		int x = stack.search(a);
		return stack.get(x);
	}
}
