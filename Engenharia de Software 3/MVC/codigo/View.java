import java.util.List;

public class View implements Observer {
    private Aposentadoria aposentadoria;

    public View(Aposentadoria aposentadoria) {
        this.aposentadoria = aposentadoria;
    }

    public void setA(Aposentadoria aposentadoria) {
        this.aposentadoria = aposentadoria;
    }

    public void update(List<String> list) {
      
        concederAposentadoria();
    }

    public void extrairDadosSistema() {
     
    }

    public void concederAposentadoria() {
        aposentadoria.emitirAposentadoria();
    }
}
