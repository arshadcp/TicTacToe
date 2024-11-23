package Strategy;

public class Strategymain {
    public static void main(String[] args) {
        GoogleMap gm=new GoogleMap();
        gm.findPath("Bangalore","Calicut",Mode.CAR);
    }
}
