import java.util.Date;

public class Sistema {
    private String licenca;
    private Date data;

    public String getLicenca() {
        return licenca;
    }

    public Date getData() {
        return data;
    }

    public boolean matches(Sistema s) {
        return this.licenca.equals(s.getLicenca()) && this.data.equals(s.getData());
    }
}
