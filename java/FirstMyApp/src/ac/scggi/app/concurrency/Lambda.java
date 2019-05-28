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
//				list.stream().forEach(new Consumer<Integer>() {
//					@Override
//					public void accept(Integer t) {
//						// TODO Auto-generated method stub
//						System.out.println(t);
//					}
//				});
				
				list.stream().forEach(e->{System.out.println(e);});				
			}
			
		});
	}
}
