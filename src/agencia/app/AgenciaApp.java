package agencia.app;

import agencia.dominio.*;

public class AgenciaApp {
    public static void main(String[] args) {

        Agencia tarriendoOTevendo = new Agencia("Tarriendo o Tevendo S.A");

        Casa casa = new Casa("Cra 33 # 12a - 45", 350000000, 750000, true);
        Apartamento apartamento = new Apartamento("Calle 12a # 33 - 15",72000000,650000,true);
        Lote lote = new Lote("Cra 99D # 122 - 54h",125000000);
        Casa casa2 = new Casa("Cra 25 # 75 - 12", 720000000, 999999, false);
        Casa casa3 = new Casa("Calle 1 # 95 - 1", 850000000, 675000, false);
        Casa casa4 = new Casa("Transversal 22 # 1a - 45", 127500300, 800000, true);

        tarriendoOTevendo.agregarInmueble(casa2);
        tarriendoOTevendo.agregarInmueble(casa2);
        tarriendoOTevendo.agregarInmueble(casa);
        tarriendoOTevendo.agregarInmueble(lote);
        tarriendoOTevendo.agregarInmueble(casa3);
        tarriendoOTevendo.agregarInmueble(casa4);
        tarriendoOTevendo.agregarInmueble(apartamento);
        System.out.println("\n");
        tarriendoOTevendo.arrendar(casa3);
        tarriendoOTevendo.arrendar(casa3);
        System.out.println("\n");
        tarriendoOTevendo.devolver(casa3);
        tarriendoOTevendo.devolver(casa3);
        System.out.println("\n");
        tarriendoOTevendo.vender(casa3);
        tarriendoOTevendo.vender(casa2);
        tarriendoOTevendo.vender(casa2);
        System.out.println("\n");
        tarriendoOTevendo.getArrendablesDisponibles();
        System.out.println("\n");
        tarriendoOTevendo.getArrendados();


    }
}
