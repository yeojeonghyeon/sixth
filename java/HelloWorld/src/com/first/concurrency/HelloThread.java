package com.first.concurrency;

public class HelloThread extends Thread {
	@Override
	public void run() {
		System.out.println("Hello Thread => " + Thread.currentThread().getName());
	}
}

class HelloRunnable implements Runnable{
	private int current;
	HelloRunnable(int current){
		this.current = current;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello Runnable => " + current + Thread.currentThread().getName());
	}
}

class Client{
	public static void main(String[] args) {
		Thread t1 = new HelloThread();
		Thread t2 = new Thread(new HelloRunnable(1));
		Thread t3 = new Thread(() -> {
			System.out.println("lambda " + Thread.currentThread().getName());
		});
		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("anonymous inner class " + Thread.currentThread().getName());
			}
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}