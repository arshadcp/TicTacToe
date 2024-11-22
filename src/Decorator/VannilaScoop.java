package Decorator;

public class VannilaScoop implements Icecream{
    private Icecream icecream;

    public VannilaScoop(Icecream icecream){//parametarized constructor
        //normal addons will always come on top of base addons(icecream will always be there)
        this.icecream=icecream;
    }
    public int cost(){
        return icecream.cost()+60;
    }
    public String description(){
        return icecream.description()+" VanilaScoop";
    }
}
