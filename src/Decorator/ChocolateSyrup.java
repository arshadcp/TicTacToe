package Decorator;

public class ChocolateSyrup implements Icecream {
    private Icecream icecream;

    public ChocolateSyrup(Icecream icecream){//parametarized constructor
        //normal addons will always come on top of base addons(icecream will always be there)
        this.icecream=icecream;
    }
    public int cost(){

        return icecream.cost()+15;
    }
    public String description(){
        return icecream.description()+" ChocolateSyrup";
    }
}
