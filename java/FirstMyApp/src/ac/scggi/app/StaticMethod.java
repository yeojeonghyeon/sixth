package ac.scggi.app;

public class StaticMethod {
	// �ν��Ͻ� ����
	public int i;
	// entry point, Ŭ���� �Լ�
	public static void main(String[] args) {
		StaticMethod sm = new StaticMethod();
		sm.i = 1;
		showStaticMethod(sm);
	}
	
	// Ŭ���� �Լ�
	public static void showStaticMethod(StaticMethod sm) {
		sm.showInfo();
	}
	// �ν��Ͻ� �Լ�
	// world open����
	public void showInfo() {
		System.out.println(i);
	}
}