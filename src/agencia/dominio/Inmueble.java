package agencia.dominio;

public abstract class Inmueble  {

    private String direccion;
    private long valorVentar;
    private long valorArriendo;
    private boolean arrendado;

    public Inmueble(String direccion, long valorVentar, long valorArriendo, boolean arrendado) {

        this.direccion = direccion;
        this.valorVentar = valorVentar;
        this.valorArriendo = valorArriendo;
        this.arrendado = arrendado;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getValorVentar() {
        return valorVentar;
    }

    public long getValorArriendo() {
        return valorArriendo;
    }

    public boolean isArrendado() {
        return arrendado;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setValorVentar(long valorVentar) {
        this.valorVentar = valorVentar;
    }

    public void setValorArriendo(long valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public void setArrendado(boolean arrendado) {
        this.arrendado = arrendado;
    }
}
