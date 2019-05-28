package ac.scggi.app.concurrency;

import java.util.Arrays;
import java.util.List;

public class AnynomousInnerClass {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			MyAccount myAccount = new MyAccount(1000000);
			@Override
			public void run() {
				List<Integer> list = Arrays.asList(1,2,3,4);
				list.stream().forEach(v->{
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(v);
					System.out.println(myAccount.getBalance());
				});
			}
		});
//		t.setDaemon(true);
		t.start();
		try {
			// 이 함수를 호출한 thread가 block 상태고,,,,
			Thread.sleep(500);
			t.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main method 종료");
	}
}

class MyAccount{
	long balance;
	public MyAccount(long balance) {
		this.balance = balance;
	}
	public synchronized void setBalance(long balance) {
		this.balance = balance;
	}
	public synchronized long getBalance() {
		System.out.println(Thread.holdsLock(this));
		return this.balance;
	}
}
