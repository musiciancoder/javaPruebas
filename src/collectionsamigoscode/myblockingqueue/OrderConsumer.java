package collectionsamigoscode.myblockingqueue;

import java.util.concurrent.BlockingQueue;

public class OrderConsumer implements Runnable{

    private BlockingQueue<String>queue;

    public OrderConsumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            System.out.println(queue.take()); //take blocks the queue if there is no more work to do
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
