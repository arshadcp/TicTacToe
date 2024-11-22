package Decorator;

public class Chocochips implements Icecream{
    private Icecream icecream;


    public Chocochips(Icecream icecream){//parametarized constructor
        //normal addons will always come on top of base addons(icecream will always be there)
        this.icecream=icecream;
    }
    public int cost(){

        return icecream.cost()+10;
    }
    public String description(){
        return icecream.description()+" Chocochips";
    }
}
