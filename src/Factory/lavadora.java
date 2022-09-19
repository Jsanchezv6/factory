package Factory;

public abstract class lavadora {
    protected boolean tieneTambor;
    protected boolean tieneMandos;
    protected String  tipoCarga;

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void ponerTambor() {
        tieneTambor = true;
        System.out.println("Tambor "+ tieneTambor);
    }

    public void ponerMandos() {
        tieneMandos = true;
        System.out.println("Mandos "+ tieneMandos);
    }
}
