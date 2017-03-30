package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;


public class Thread_test  {
	
	// Number of items we'll process
    private final int NUM_ITEMS = 100;
 
    // Signal the worker thread there's no more work to be done. 
    private final AtomicBoolean stop_flag = new AtomicBoolean(false);
 
    // Queue to transfer messages between threads. 
    private final BlockingQueue<String> queue = new LinkedBlockingQueue<String>();
 
    // Reader thread example
    private final Runnable reader = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < NUM_ITEMS; ++i) {
                queue.add("Example" + i);
                // This parts simulates "blocking" behavior
                if ((i % 5) == 0) {
                    try {
                        Thread.sleep(100l);
                    } catch (InterruptedException e) {
                    }
                }
            }
            // Signal the worker thread that there are no more items.
            stop_flag.set(true);
            System.out.println("Reader thread stopped.");
        }
    };
 
    // Worker thread implementation - tries to "buffer" larger units of work 
    // instead of just spinning on the reader when there's no work to be done. 
    private final Runnable batch_worker = new Runnable() {
        @Override
        public void run() {
            int counter = 0;
            final int batch_size = 10;
            List<String> batch = new ArrayList<String>(batch_size);
            while (!stop_flag.get()) {
                // Try and process in batches rather than just 1 row at a time
                queue.drainTo(batch, 10);
                // Stall if we don't have a batch.
                if (batch.isEmpty()) {
                    try {
                        Thread.sleep(200l);
                    } catch (InterruptedException e) {
                    }
                }
                // Process work.
                for (String item : batch)
                    System.out.println(item);
                batch.clear();
            }
            // Reader thread has stopped. Process remaining work. 
            String item = null;
            while ((item = queue.poll()) != null) {
                System.out.println(item);
            }
            System.out.println("Batch worker thread stopped.");
        }
    };
 
    private void run() throws InterruptedException {
        Thread reader_thread = new Thread(reader);
        Thread batch_worker_thread = new Thread(batch_worker);
        reader_thread.start();
        batch_worker_thread.start();
        batch_worker_thread.join();
        reader_thread.join();
    }
 
    public static void main(String[] args) throws InterruptedException {
    	Thread_test example = new Thread_test();
        example.run();
    }
		
}
