public class Passe {
    private static Passe instance;
    private String registro;

    private Passe() {
        this.registro = "Passe único";
    }

    public static Passe getInstance() {
        if (instance == null) {
            instance = new Passe();
        }
        return instance;
    }

    public void comprar(String registro) {
        this.registro = registro;
        System.out.println("Compra registrada: " + registro);
    }

    public String getRegistro() {
        return registro;
    }
}
