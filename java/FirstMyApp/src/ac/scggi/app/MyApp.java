package ac.scggi.app;

public class MyApp {
	// �Լ� ����, �ּ�(����� �ƹ��� ������ ����)
	public static void main(String[] args) {
		int total = 0; // ���� ����
		float mul = 0f;
		System.out.println("Hello World!");
		total = sum(1, 2);
		System.out.println(total);
		total = subtract(1, 2);
		//mul = multiply(1f, 2f);
		MyApp myApp = new MyApp();// Ŭ������ �ν��Ͻ��� ����
		mul = myApp.multiply(1f, 2f);
		// mul�� ����ϼ���
		System.out.println(mul);
	}
	
	static int subtract(int x, int y) {
		return x-y;
	}
	
	static int sum(int x, int y) {
		return x+y;
	}
	
	float multiply(float x, float y) {
		return x*y;
	}
}