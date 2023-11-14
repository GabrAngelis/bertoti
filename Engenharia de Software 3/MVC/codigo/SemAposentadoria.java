public class SemAposentadoria implements Aposentadoria {
    private View v;
    private Banco b;

    public void setV(View view) {
        this.v = view;
    }

    public void emitirAposentadoria() {
        System.out.println("Não há aposentadoria disponível.");
    }
}
