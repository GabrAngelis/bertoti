public class AposentadoriaImpl implements Aposentadoria {
    private View v;
    private Banco b;

    public void setV(View view) {
        this.v = view;
    }

    public void emitirAposentadoria() {
        System.out.println("Aposentadoria emitida com sucesso!");
    }
}
