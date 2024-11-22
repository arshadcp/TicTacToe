package Decorator;

public class ChocolateCone implements  Icecream {
    //cone can come as a base or as a addon
    private Icecream icecream;//sometimes icecream already there,cone as normal addon
    public ChocolateCone(){//empty constructor
        //if cone is coming as base

    }
    public ChocolateCone(Icecream icecream){//parametarized constructor
        //if cone is coming as topping--icecream already there cone-scoop-cone
        this.icecream=icecream;
    }
    @Override
    public int cost() {
        if(icecream!=null) {
            return icecream.cost() + 20;
        }else{
            return 20;
        }
    }

    @Override
    public String description() {
        if(icecream!=null) {
            return icecream.description() + " chocolatecone";
        }else{
            return "chocolatecone";
        }
    }
}
