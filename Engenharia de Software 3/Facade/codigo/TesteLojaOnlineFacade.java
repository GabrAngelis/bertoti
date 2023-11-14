import java.util.ArrayList;
import java.util.List;

public class TesteLojaOnlineFacade {
    public static void main(String[] args) {
        LojaOnlineFacade lojaFacade = new LojaOnlineFacade();

        Cliente cliente = new Cliente();
        List<Item> itens = new ArrayList<>();

        if (lojaFacade.verificarEstoque(itens)) {
            double precoTotal = lojaFacade.calcularPrecoTotal(itens);
            int pedidoId = 123;

            lojaFacade.realizarPedido(cliente, itens);
            lojaFacade.processoPagamento(pedidoId, precoTotal);

            String statusPedido = lojaFacade.rastreamentoPedido(pedidoId);
            System.out.println("Status do pedido: " + statusPedido);
        } else {
            System.out.println("Alguns itens não estão disponíveis no estoque.");
        }
    }
}
