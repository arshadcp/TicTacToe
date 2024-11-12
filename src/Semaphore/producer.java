package Semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;
  public class producer implements Runnable {
        private Queue<Shirt> store;
        private String name;
        Semaphore semaProducer;
        Semaphore semaConsumer;
        public producer(Queue<Shirt> store, String name,Semaphore semProducer,Semaphore semConsumer){
            this.store=store;
            this.name=name;
            semaProducer=semProducer;
            semaConsumer=semConsumer;
        }
        //producer want to add products to the store
        public void run() {
            while (true){
                try {
                    semaProducer.acquire();

                    System.out.println("Current size: " + store.size() +
                            " adding a shirt by producer: " + name);
                    store.add(new Shirt());

                    semaConsumer.release();
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        }

  }
