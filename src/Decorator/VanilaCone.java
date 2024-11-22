package Decorator;

public class VanilaCone implements Icecream{
    private Icecream icecream;
    public VanilaCone(){//empty constructor


    }
    public VanilaCone(Icecream icecream){//parametarized constructor
        //if cone is coming as topping--icecream already there cone-scoop-cone
        this.icecream=icecream;
    }
    @Override
    public int cost() {
        if(icecream!=null) {
            return icecream.cost() + 30;
        }else{
            return 30;
        }
    }

    @Override
    public String description() {
        if(icecream!=null) {
            return icecream.description() + " Vanilacone";
        }else{
            return " Vanilacone";
        }
    }
}
