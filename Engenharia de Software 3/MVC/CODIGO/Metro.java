public class Metro implements Bilhete {
    private View v;
    private Cobrador cobrador;

    @Override
    public void comprarBilhete() {
        System.out.println("Bilhete de metrô comprado com sucesso!");
    }

    public void setV(View view) {
        this.v = view;
    }
}
