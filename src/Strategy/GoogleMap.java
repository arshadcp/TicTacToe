package Strategy;

public class GoogleMap {
    Mode mode;
    String source;
    String destination;
    PathCalculator pc;
    public GoogleMap(){
        this.source=source;
        this.destination=destination;
        this.mode=mode;
    }
    public void findPath(String source,String destination,Mode mode){
         PathCalculator p=PathCalculatorFactory.getPathCalculator( mode);
         p.path( source,destination);

    }
}
