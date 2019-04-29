package ac.scggi.app;

public class ArithmeticOperator {
	public int x;
	public int y;
	public ArithmeticOperator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int add() {
		return x+y;
	}
	int subtract() {
		return x-y;
	}
	int multiply() {
		return x*y;
	}
	int divide() {
		return x/y;
	}
	void showInfo() {
		System.out.println(x);
		System.out.println(y);
	}
}
