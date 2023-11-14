public class PagamentoParcelado implements Pagar {
    private double valorTotal;
    private int numeroParcelas;

    public PagamentoParcelado(double valorTotal, int numeroParcelas) {
        this.valorTotal = valorTotal;
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public void pagar() {
        double valorParcela = valorTotal / numeroParcelas;
        System.out.println("Pagamento parcelado em " + numeroParcelas + " vezes de R$ " + valorParcela);
    }
}

