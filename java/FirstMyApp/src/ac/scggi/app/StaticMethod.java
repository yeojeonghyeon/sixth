package ac.scggi.app;

public class StaticMethod {
	// 인스턴스 변수
	public int i;
	// entry point, 클래스 함수
	public static void main(String[] args) {
		StaticMethod sm = new StaticMethod();
		sm.i = 1;
		showStaticMethod(sm);
	}
	
	// 클래스 함수
	public static void showStaticMethod(StaticMethod sm) {
		sm.showInfo();
	}
	// 인스턴스 함수
	// world open노출
	public void showInfo() {
		System.out.println(i);
	}
}
