package Semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class consumer implements Runnable {
    private Queue<Shirt> store;
    private String name;
    Semaphore semaProducer;
    Semaphore semaConsumer;

    public consumer(Queue<Shirt> store, String name, Semaphore semProducer, Semaphore semConsumer) {
        this.store = store;
        this.name = name;
        semaProducer = semProducer;
        semaConsumer = semConsumer;
    }


    public void run() {
        while (true) {
            try {
                semaConsumer.acquire();
                System.out.println("Current size: " + store.size() +
                        " removing a shirt by consumer: " + name);

                store.remove();//adding consumer

                semaProducer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

