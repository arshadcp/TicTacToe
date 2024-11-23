package Strategy;

public interface PathCalculator {
    public void path(String source, String destination);
    //todo:path calculator class should be Singleton as they don't have any other usecase
    //we don't want to create new Object every time-waste of memory
}
