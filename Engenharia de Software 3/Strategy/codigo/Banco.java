public class Banco {
    private String nomeBanco;
    private String nomeCliente;
    private int cpfCliente;
    private Pagar formaDePagamento;

    public Banco(String nomeBanco, String nomeCliente, int cpfCliente) {
        this.nomeBanco = nomeBanco;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
    }

    public void setPagar(Pagar pagar) {
        this.formaDePagamento = pagar;
    }

    public void realizarPagamento() {
        if (formaDePagamento != null) {
            formaDePagamento.pagar();
            System.out.println("Pagamento realizado com sucesso!");
        } else {
            System.out.println("Selecione uma forma de pagamento primeiro.");
        }
    }
}

