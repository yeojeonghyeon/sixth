package ac.scggi.app.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

public class ExecutorServiceDemo {
	@Test
	public void testPrallelExecute() throws Exception{
		List<String> testSample = Arrays.asList("가", "나", "다", "라");
		ExecutorService threadPool = Executors.newFixedThreadPool(4);
		
		List<Future<Video>> futures = new ArrayList<Future<Video>>();
		
		for(final String sample : testSample) {
			Callable<Video> callable = new Callable<Video>(){
				@Override
				public Video call() throws Exception{
					System.out.println("Time:"+new Date()+" -Thread Name: "+Thread.currentThread().getName());
					if(Thread.currentThread().getName().equals("pool-1-thread-3")) {
						Thread.sleep(50);
					}
					Video video = new Video();
					video.setDialog(sample);
					return video;
				}
			};
			futures.add(threadPool.submit(callable));
		}
		threadPool.shutdown();
		
		List<Video> results = new ArrayList<Video>();
		for(Future<Video> future : futures) {
			results.add(future.get());
		}
		
//		assertFalse(results.isEmpty());
		for (Video result : results) {
			System.out.println(result.getDialog());
		}

		
	}
}

class Video{
	public String dialog;
	public void setDialog(String str) {
		dialog = str;
	}
	public String getDialog() {
		return dialog;
	}
}
