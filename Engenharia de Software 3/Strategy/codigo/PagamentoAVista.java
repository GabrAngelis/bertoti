public class PagamentoAVista implements Pagar {
    private double valorTotal;

    public PagamentoAVista(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento à vista de R$ " + valorTotal);
    }
}

