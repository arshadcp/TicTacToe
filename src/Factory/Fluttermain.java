package Factory;

public class Fluttermain {
    public static void main(String[] args) {
       Flutter flutter=new Flutter(SupportedPlatform.IOS);
       UI_factory factory=flutter.createFactory();
       Button but=factory.createButton();
       Menu men=factory.createMenu();
       dropDown drop=factory.createDropdown();


    }
}
