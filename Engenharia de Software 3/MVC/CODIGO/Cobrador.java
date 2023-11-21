import java.util.List;

public class Cobrador implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<Conducao> conducao = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(List<Conducao> conducoes) {
        for (Observer observer : observers) {
            observer.update(conducoes);
        }
    }

    public void addConducao(Conducao c) {
        conducao.add(c);
        notifyObservers(conducao);
    }

    public Conducao buscarConducao(Conducao conducao) {
        return conducao;
    }
}
