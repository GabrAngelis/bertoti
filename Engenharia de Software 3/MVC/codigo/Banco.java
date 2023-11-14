import java.util.ArrayList;
import java.util.List;

public class Banco implements Subject {
    private List<Sistema> sistema;
    private List<Observer> observers;

    public Banco() {
        this.sistema = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addSistema(Sistema s) {
        sistema.add(s);
    }

    public void buscarSistema(Sistema s) {
        List<String> encontrados = new ArrayList<>();
        for (Sistema sistema : sistema) {
            if (sistema.matches(s)) {
                encontrados.add(sistema.getLicenca());
            }
        }
        notifyObservers(encontrados);
    }

    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    public void notifyObservers(List<String> encontrados) {
        for (Observer observer : observers) {
            observer.update(encontrados);
        }
    }
}
