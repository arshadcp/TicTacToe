package Observer;

public class Observermain {
    public static void main(String[] args) {
            Amazon az=new Amazon();
            invoiceGenerator iv=new invoiceGenerator();
            notifiSubscriber nf=new notifiSubscriber();

            az.subscribe(iv);
            az.subscribe(nf);
            az.Orderplaced();
    }
}
