import java.util.Date;

public class TesteBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        View view = new View(new AposentadoriaImpl());
        Aposentadoria aposentadoria = new AposentadoriaImpl();
        Aposentadoria semAposentadoria = new SemAposentadoria();

        view.setA(aposentadoria);
        aposentadoria.setV(view);
        semAposentadoria.setV(view);

        banco.registerObserver(view);

        Sistema sistema = new Sistema();
        sistema.getLicenca("LicençaTeste");
        sistema.getData(new Date());
        banco.addSistema(sistema);

        banco.buscarSistema(sistema);
    }
}
