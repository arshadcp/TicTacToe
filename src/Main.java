import Semaphore.Shirt;
import Semaphore.consumer;
import Semaphore.producer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue<Shirt> store=new ConcurrentLinkedDeque<>();

        Semaphore semaProducer=new Semaphore(5);
        Semaphore semaConsumer=new Semaphore(0);


        producer p1=new producer(store,"p1",semaProducer,semaConsumer);
        producer p2=new producer(store,"p2",semaProducer,semaConsumer);
        producer p3=new producer(store,"p3",semaProducer,semaConsumer);
        producer p4=new producer(store,"p4",semaProducer,semaConsumer);
        producer p5=new producer(store,"p5",semaProducer,semaConsumer);
        Thread tp1=new Thread(p1);
        Thread tp2=new Thread(p2);
        Thread tp3=new Thread(p3);
        Thread tp4=new Thread(p4);
        Thread tp5=new Thread(p5);


        consumer c1=new consumer(store,"c1",semaProducer,semaConsumer);
        consumer c2=new consumer(store,"c2",semaProducer,semaConsumer);
        consumer c3=new consumer(store,"c3",semaProducer,semaConsumer);
        consumer c4=new consumer(store,"c4",semaProducer,semaConsumer);
        consumer c5=new consumer(store,"c5",semaProducer,semaConsumer);
        Thread tc1=new Thread(c1);
        Thread tc2=new Thread(c2);
        Thread tc3=new Thread(c3);
        Thread tc4=new Thread(c4);
        Thread tc5=new Thread(c5);
        tp1.start();
        tp2.start();
        tp3.start();
        tp4.start();
        tp5.start();

        tc1.start();
        tc2.start();
        tc3.start();
        tc4.start();
        tc5.start();






    }
}