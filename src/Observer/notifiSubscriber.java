package Observer;

public class notifiSubscriber implements OrderPlacedSubscriber {
    public void Event(){
        System.out.println("send notification by mobile");
        System.out.println("send notification by email");
    }
}
