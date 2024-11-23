package Strategy;

public class walkPathCalculator implements PathCalculator {
    public void path(String source, String destination){
        System.out.println("trip by walk from "+source+" to "+destination);
    }
}
