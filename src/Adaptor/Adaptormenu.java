package Adaptor;

public class Adaptormenu {
    public static void main(String[] args) {
        PhonePe pay=new PhonePe(new YesBankAPIAdaptor());
       // System.out.println(pay);
    }
}
