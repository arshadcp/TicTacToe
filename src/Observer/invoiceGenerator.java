package Observer;

public class invoiceGenerator implements OrderPlacedSubscriber {

    public void Event(){
        System.out.println("invoice is generated");
    }
}
