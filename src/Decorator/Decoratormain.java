package Decorator;

public class Decoratormain {
    public static void main(String[] args) {
       Icecream ic=new Chocochips(
                     new VannilaScoop(
                         new StrawberryScoop(
                            new VanilaCone(
                                 new ChocolateSyrup(
                                    new ChocolateCone())))));
       System.out.println(ic);
        System.out.println(ic.cost());
        System.out.println(ic.description());
    }
}
