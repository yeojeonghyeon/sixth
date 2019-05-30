package ac.scggi.app.concurrency;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Lambda {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				// anonymous inner class
				list.stream().forEach(new Consumer<Integer>() {
					@Override
					public void accept(Integer t) {
						// TODO Auto-generated method stub
						System.out.println(t);
					}
				});
				// @FunctionalInterface
				// lambda
				Consumer<Integer> consumer = (e)->{System.out.println("람다 함수 변수= >"+e);};
				list.stream().forEach(e->{System.out.println(e);});				
				list.stream().forEach(System.out::println);				
				list.stream().forEach(consumer);				
				list.stream().forEach(Lambda::test);				
				list.stream().forEach(Lambda::testify);				
				list.stream().forEach(Lambda::testInt);	
				
				list.stream().filter((t)->{return t>3;}).forEach(System.out::println);
				
//				list.stream().forEach(Lambda::testString);				
			}
			
		});
		
		t.start();
	}
	public static void test(Integer t) {
		System.out.println("test 클래스 함수 => "+t);
	}
	public static void testify(Number t) {
		System.out.println("testify 클래스 함수 => "+t);
	}	
	public static void testInt(Number t) {
		System.out.println("testInt1 클래스 함수 => "+t);
	}	
	public static void testInt(Object t) {
		System.out.println("Integer2 클래스 함수 => "+t);
	}	
	public static void testString(String t) {
		System.out.println("testInt 클래스 함수");
	}	
}
