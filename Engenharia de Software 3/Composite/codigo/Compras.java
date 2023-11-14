import java.util.ArrayList;
import java.util.List;

public class Compras {
    private List<Passe> passes;
    private double valor;

    public Compras() {
        passes = new ArrayList<>();
        valor = 0.0;
    }

    public void comprar() {
        // Lógica para realizar a compra dos passes
        for (Passe passe : passes) {
            passe.comprar();
            valor += passe.getValorPasse();
        }
        System.out.println("Valor total da compra: " + valor);
    }

    public void addPasses(Passe passe) {
        passes.add(passe);
    }

    public List<Passe> getPasses() {
        return passes;
    }

    public void delPasse(Passe passe) {
        passes.remove(passe);
    }
}
