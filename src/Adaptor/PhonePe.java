package Adaptor;

public class PhonePe {
    private BankAPIAdapter bankAPIAdapter;
   public PhonePe(YesBankAPIAdaptor yesBankAPIAdaptor){//constructor
       this.bankAPIAdapter=new YesBankAPIAdaptor();

   }
   public void checkBalance(User user){
       double b=bankAPIAdapter.checkBalance(user);
       System.out.println("Balance: "+b);
   }

    boolean changePin(User user, int currentPin,int newPin){
          return bankAPIAdapter.changePin(user,currentPin,newPin);
    }

//    @Override
//    public String toString() {
//        return "PhonePe{" +
//                "bankAPIAdapter=" + bankAPIAdapter +
//                '}';
//    }

    public void trasferMoney(User fromUser, User toUser, int amount){
       if(bankAPIAdapter.checkBalance(fromUser)<amount){
           System.out.println("failed");
       }
       else{
           int status=bankAPIAdapter.doTransaction(fromUser,toUser,amount);
           switch(status){
               case 1:System.out.println("Successful");
                       break;
               case 0:System.out.println("failed");
                       break;
               default:System.out.println("inProgress");
       }   }
    }

}
