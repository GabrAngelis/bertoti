public class TesteBanco {
    public static void main(String[] args) {
        Banco banco = new Banco("BancoXYZ", "João", 123456789);

        PagamentoAVista pagamentoAVista = new PagamentoAVista(1000.0);
        PagamentoParcelado pagamentoParcelado = new PagamentoParcelado(2000.0, 3);

        banco.setPagar(pagamentoAVista);

        banco.realizarPagamento();

        banco.setPagar(pagamentoParcelado);

        banco.realizarPagamento();
    }
}
