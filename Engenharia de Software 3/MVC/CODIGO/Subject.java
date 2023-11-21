import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void registerObserver(Observer o);
    void notifyObservers(List<Conducao> conducao);
}
