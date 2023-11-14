public class Metro implements Passe {
    private String tipo;
    private double valor;

    public Metro(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public void comprar() {
        // Lógica para comprar passagem de metrô
        System.out.println("Passagem de metrô comprada. Tipo: " + tipo);
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
