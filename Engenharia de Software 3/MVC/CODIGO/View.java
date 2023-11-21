import java.util.List;

public class View implements Observer {
    private Bilhete bilhete;
    private List<Conducao> conducao;

    public void setConducao(Conducao c) {
        this.conducao.add(c);
        System.out.println("Condução adicionada à View!");
    }

    @Override
    public void update(List<Conducao> conducoes) {
        System.out.println("View atualizada com novas conduções!");
    }
}

