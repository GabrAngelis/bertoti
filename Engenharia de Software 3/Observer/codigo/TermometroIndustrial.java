public class TermometroIndustrial implements Observer {
    @Override
    public void controlar(double temperatura, double umidade, double pressao) {
        System.out.println("Termômetro industrial controlando: Temperatura = " + temperatura);
    }
}
