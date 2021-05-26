package agencia.dominio;


import java.util.ArrayList;
import java.util.List;


public class Agencia {

    private List<Inmueble> inmuebles;

    private String nombre;

    public Agencia(String nombre) {
        this.nombre = nombre;
        this.inmuebles = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarInmueble(Inmueble inmueble) {
        if(!inmuebles.contains(inmueble)) {
            inmuebles.add(inmueble);
            System.out.println("Se ha agregado el inmueble: " + inmueble.getDireccion());
        } else {
            System.out.println("¡Advertencia! El inmueble "+ inmueble.getDireccion()+" ya existe dentro de la agencia");
        }
    }

    public boolean arrendar(Arrendable inmueble) {
        Inmueble inmuebleArrendar = (Inmueble) inmueble;
        if (existe(inmuebleArrendar)) {
            if (inmuebleArrendar.isArrendado()) {
                System.out.println("El inmueble:" + inmuebleArrendar.getDireccion() + " se encuentra actualmente ocupado");
                return false;

            } else {
                System.out.println("El inmueble: " + inmuebleArrendar.getDireccion() + " se arrendo exitosamente");
                inmuebleArrendar.setArrendado(true);
                return true;
            }
        }
        return false;
    }


    public boolean devolver(Arrendable inmueble) {
        Inmueble inmuebleArrendar = (Inmueble) inmueble;
        if (existe(inmuebleArrendar)) {
            if (!inmuebleArrendar.isArrendado()) {
                System.out.println("El inmueble:" + inmuebleArrendar.getDireccion() + " se encuentra actualmente desocupado");
                return true;

            } else {
                System.out.println("El inmueble: " + inmuebleArrendar.getDireccion() + " se devolvio exitosamente");
                inmuebleArrendar.setArrendado(false);
                return false;
            }

        }
        return false;
    }

    public boolean vender(Inmueble inmueble) {
        if (existe(inmueble)) {
            if (inmueble.isArrendado()) {
                System.out.println("El inmueble se encuentra arrendado, no puede ser vendido");
                return false;
            } else {
                System.out.println("El precio del inmueble es: " + inmueble.getValorVentar());
                System.out.println("Se vende el inmueble: " + inmueble.getDireccion());
                inmuebles.remove(inmueble);
                return true;
            }
        }
        return false;
    }

    public List<Inmueble> getArrendablesDisponibles() {
        List<Inmueble> inmueblesDisponibles = new ArrayList<>();
        inmuebles.forEach(inmueble ->{
            if (!inmueble.isArrendado() &&  inmueble.getValorArriendo() != 0) {
                inmueblesDisponibles.add(inmueble);
                System.out.println("Este inmueble se encuentra disponible: " + inmueble.getDireccion());

            }

        });
        if(inmueblesDisponibles.size() == 0) {
            System.out.println("No existen inmuebles disponibles");
        }
        return inmueblesDisponibles;
    }

    public List<Inmueble> getArrendados() {
        List<Inmueble> inmueblesArrendados = new ArrayList<>();
        inmuebles.forEach(inmueble ->{
            if(inmueble.isArrendado() && inmueble.getValorArriendo() !=0) {
                inmueblesArrendados.add(inmueble);
                System.out.println("Este inmueble se encuentra arrendado: " + inmueble.getDireccion());
            }

        });
        if(inmueblesArrendados.size() == 0) {
            System.out.println("No existen inmuebles arrendados");
        }
        return inmueblesArrendados;

    }

    private boolean existe(Inmueble inmueble) {
        if (inmuebles.contains(inmueble)) {
            return true;
        } else {
            System.out.println("¡Error!, este inmueble no existe en la agencia " + getNombre());
            return false;
        }

    }
}
