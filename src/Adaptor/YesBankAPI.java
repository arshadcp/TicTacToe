package Adaptor;

public class YesBankAPI {
    public int getBalance(String name,String password){
        return 1000;
    }
    public char Transaction(String fromUser,String toUser,
                            double amount){
        return 'y';
    }
    public boolean changePin(String fromUser,String password,
                             int currentPin,int newPin){
        return true;
    }
}
