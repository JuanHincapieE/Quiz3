package agencia.dominio;

public class Casa extends Inmueble implements Arrendable {

    private boolean arrendado;

    public Casa(String direccion, long valorVentar, long valorArriendo, boolean arrendado) {
        super(direccion, valorVentar, valorArriendo, arrendado);
    }

    @Override
    public boolean arrendar() {
        if (isArrendado() == true) {
            return true;
        } else {
            return false;

        }
    }

    @Override
    public boolean devolver() {

        return false;
    }
    @Override
    public String toString() {
        return "Casa";
    }
}
