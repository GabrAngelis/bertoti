import java.util.List;

public interface Subject {
    void registerObserver(Observer obs);
    void notifyObservers(List<String> encontrados);
}
