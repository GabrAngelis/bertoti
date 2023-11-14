public class TesteControleAcougue {
    public static void main(String[] args) {
        Observer termometro = new TermometroIndustrial();
        Observer painelControle = new PainelControle();
        Observer regulador = new Regulador();

        ControleAcougue controleAcougue = new ControleAcougue();

        controleAcougue.addObserver(termometro);
        controleAcougue.addObserver(painelControle);
        controleAcougue.addObserver(regulador);

        controleAcougue.setTemperatura(25.0);
        controleAcougue.setUmidade(60.0);
        controleAcougue.setPressao(1013.0);
    }
}
