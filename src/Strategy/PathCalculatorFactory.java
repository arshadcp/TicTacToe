package Strategy;

public class PathCalculatorFactory {
    //factory returns object
    public static PathCalculator getPathCalculator(Mode mode) {
        switch (mode) {
            case CAR:
                return new carPathCalculator();
            case BIKE:
                return new bikePathCalculator();
            case WALK:
                return new walkPathCalculator();
            default:
                return null;
        }
    }

}
