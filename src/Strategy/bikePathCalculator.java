package Strategy;

public class bikePathCalculator implements PathCalculator {
    public void path(String source, String destination){
        System.out.println("trip by bike from "+source+" to "+destination);
    }
}
