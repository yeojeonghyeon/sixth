package ac.scggi.app.concurrency;

public class BlockingQueueTest {
	public static void main(String[] args) {
		BlockingQueue<String> q = new BlockingQueue<String>(10);
		Thread t1 = new Thread(new ConsumerQueue(q));
		Thread t2 = new Thread(new ProducerQueue(q));
		t1.start();
		t2.start();
	}
}

class ConsumerQueue implements Runnable{
	BlockingQueue<String> q;
	public ConsumerQueue(BlockingQueue<String> q) {
		this.q = q;
	}
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println(q.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ProducerQueue implements Runnable{
	BlockingQueue<String> q;
	public ProducerQueue(BlockingQueue<String> q) {
		this.q = q;
	}
	@Override
	public void run() {
		while(true) {
			try {
				String time = Long.toString(System.currentTimeMillis());
				q.put(time);
				System.out.println("put "+time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}