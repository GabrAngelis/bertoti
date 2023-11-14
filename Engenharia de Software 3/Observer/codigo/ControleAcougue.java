import java.util.ArrayList;
import java.util.List;

public class ControleAcougue {
    private double temperatura;
    private double umidade;
    private double pressao;
    private List<Observer> observers;

    public ControleAcougue() {
        this.observers = new ArrayList<>();
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        controle();
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
        controle();
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
        controle();
    }

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    private void notificarObservers() {
        for (Observer obs : observers) {
            obs.controlar(temperatura, umidade, pressao);
        }
    }

    public void controle() {
        notificarObservers();
    }
}
