package ac.scggi.app.inheritance4;

public interface DoIt {
	void doSomething(int i, double x);

	int doSomethingElse(String s);

	default boolean didItWork(int i, double x, String s) {
		System.out.println("DoIt");
		return true;
	}
}

interface DoItPlus extends DoIt {
	@Override
	default boolean didItWork(int i, double x, String s) {
		DoIt.super.didItWork(i, x, s);
		System.out.println("DoItPlus");
		return true;
	}
}

class DoSomething implements DoItPlus {
	@Override
	public void doSomething(int i, double x) {
		// TODO Auto-generated method stub
		didItWork(i, x, "a");
	}
	@Override
	public int doSomethingElse(String s) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		DoIt di;
		DoItPlus dip;
		DoSomething ds = new DoSomething();
		ds.doSomething(1, 1.0);
		di = ds;
		di.didItWork(1, 1.0, "doIt");
		dip = ds;
		dip.didItWork(1, 1.0, "doItPlus");
	}
}
