public class PainelControle implements Observer {
    @Override
    public void controlar(double temperatura, double umidade, double pressao) {
        System.out.println("Painel de controle controlando: Temperatura = " + temperatura +
                           ", Umidade = " + umidade + ", Pressão = " + pressao);
    }
}
