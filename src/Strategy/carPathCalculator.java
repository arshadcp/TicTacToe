package Strategy;

public class carPathCalculator implements PathCalculator {
    public void path(String source, String destination){
        System.out.println("trip by car from "+source+" to "+destination);
    }
}
