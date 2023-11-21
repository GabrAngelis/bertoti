public class Onibus implements Bilhete {
    private View v;
    private Cobrador cobrador;

    @Override
    public void comprarBilhete() {
        System.out.println("Bilhete de ônibus comprado com sucesso!");
    }

    public void setV(View view) {
        this.v = view;
    }
}

