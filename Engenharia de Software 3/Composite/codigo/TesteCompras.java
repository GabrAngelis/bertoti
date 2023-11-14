public class TesteCompras {
    public static void main(String[] args) {
        Compras compras = new Compras();

        Passe onibus = new Onibus("Urbano", 3.0);
        Passe metro = new Metro("Metrô Linha 1", 5.0);

        compras.addPasses(onibus);
        compras.addPasses(metro);

        compras.comprar();
    }
}
