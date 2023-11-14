public class Regulador implements Observer {
    @Override
    public void controlar(double temperatura, double umidade, double pressao) {
        System.out.println("Regulador controlando: Temperatura = " + temperatura +
                           ", Umidade = " + umidade + ", Pressão = " + pressao);
    }
}
