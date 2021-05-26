package agencia.dominio;

public class Lote extends Inmueble  {
    public Lote(String direccion, long valorVentar) {

        super(direccion, valorVentar, 0, false);
    }

    @Override
    public String toString() {
        return "Lote";
    }
}
