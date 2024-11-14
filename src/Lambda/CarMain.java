package Lambda;

public class CarMain {
    public static void main(String[] args) {
//        Car c=new Car(){
//
//
//            public void startEngine(){
//                System.out.println("Car is starting engine");
//
//            }
//            public void Brake(){
//                System.out.println("Car is braking");
//            }
//        };
//        c.startEngine();
//        c.Brake();

        MathOperation add = (a,b) ->a+b;
        MathOperation sub=(a,b) -> a-b;
       System.out.println(add.operate(1,5));
        System.out.println(sub.operate(8,1));


    }
}
