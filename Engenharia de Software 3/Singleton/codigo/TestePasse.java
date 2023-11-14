public class TestePasse {
    public static void main(String[] args) {
        Passe passe = Passe.getInstance();

        passe.comprar("Registro de compra 1");

        Passe mesmoPasse = Passe.getInstance();

        if (passe == mesmoPasse) {
            System.out.println("É a mesma instância de Passe.");
            System.out.println("Registro atual: " + mesmoPasse.getRegistro());
        } else {
            System.out.println("Algo deu errado na obtenção da instância.");
        }
    }
}
