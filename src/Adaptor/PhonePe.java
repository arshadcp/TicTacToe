package Adaptor;

public class PhonePe {
    private BankAPIAdapter bankAPIAdapter;
   public PhonePe(){//constructor
       this.bankAPIAdapter=new YesBankAPIAdaptor();

   }
   public void checkBalance(User user){
       double b=bankAPIAdapter.checkBalance(user);
       System.out.println("Balance: "+b);
   }
    public int doTransaction(User fromUser, User toUser,double amount){
       int c=bankAPIAdapter.doTransaction(fromUser,toUser,amount);
       return c;
    }
    boolean changePin(User user, int currentPin,int newPin){
          return bankAPIAdapter.changePin(user,currentPin,newPin);
    }

}
