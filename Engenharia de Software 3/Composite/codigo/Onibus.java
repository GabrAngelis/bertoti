public class Onibus implements Passe {
    private String tipo;
    private double valor;

    public Onibus(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public void comprar() {
        // Lógica para comprar passagem de ônibus
        System.out.println("Passagem de ônibus comprada. Tipo: " + tipo);
    }

    @Override
    public double getValorPasse() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
