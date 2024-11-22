package Facade;

public class Amazon {
    Product p=new Product();
    int pr=p.getProductid();
    int qnty=p.getQuantity();

    private InventoryManagement inv;
    private AddressManagement adr;
    private PaymentManagement pay;
    private SupplyChainManagement scm;
    private NotificationManagement nfm;
    private void placeOrder(){
        inv.checkCurrentCount();
        inv.StockUpdate();
        inv.priceCheck();

        adr.verifyPincode();
        adr.verifyAddress();

        pay.initiatePayment();
        pay.verifyPayment();

        scm.getTimetodelivery();
        scm.initiateOrderShipment();
        scm.getTrackinglink();

        nfm.sendsms();
        nfm.SendMail();

    }
}
