package ac.scggi.app.generic.subtype;

import java.util.List;

public class CallStack<E> implements Stack<String> {
	public E[] stack;
	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean push(String e) {
		// TODO Auto-generated method stub
		return false;
	}
}

class CallStackTest{
	public static void main(String[] args) {
		Stack<String> st = new CallStack<List<String>>();
		Stack<Object> sto = new CallStack<List<String>>());
	}
}
