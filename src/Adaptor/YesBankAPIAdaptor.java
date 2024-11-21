package Adaptor;

public class YesBankAPIAdaptor implements BankAPIAdapter{//
    //an Adapter bw yesbankAPI and PhonePe
    //from here we call yes bank
   private YesBankAPI yesBankAPI=new YesBankAPI();//create YesBank API object
    public double checkBalance(User user){
       double balance= yesBankAPI.getBalance(user.getUsername(),user.getPassword());
       return balance;
    }
    public int doTransaction(User fromUser, User toUser,double amount){
       char c= yesBankAPI.Transaction(fromUser.getUsername(),toUser.getUsername(),amount);
       if(c=='y'){
           return 1;
       }else{
           return 0;
       }
    }
    public boolean changePin(User user, int currentPin,int newPin){
      return  yesBankAPI.changePin(user.getUsername(), user.getPassword(),currentPin,newPin );
    }

}
