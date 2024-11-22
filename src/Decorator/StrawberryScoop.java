package Decorator;

public class StrawberryScoop implements Icecream{
    private Icecream icecream;

    public StrawberryScoop(Icecream icecream){//parametarized constructor
        //normal addons will always come on top of base addons(icecream will always be there)
        this.icecream=icecream;
    }
    public int cost(){
        return icecream.cost()+50;
    }
    public String description(){
        return icecream.description()+" SrawberryScoop";
    }
}
