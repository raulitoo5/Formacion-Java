package clasesAbstractas;

public class App {
    public static void main(String[] args) {
//        Vehiculo v = new Vehiculo("Marca", "modelo");

        Coche c = new Coche("Toyota", "corola", 140);
        c.mostrarInfo();
        c.mostrarVelocidadMaxima();

        VehiculoAereo h = new Helicoptero("Airbus", "Súper Puma", 6000);
        VehiculoAereo a = new Avion("Rayanair", "A320", 11800);

        llevarGente(h);
        llevarGente(a);

    }

    public static void llevarGente(VehiculoAereo v){
        v.mostrarInfo();

        if(v instanceof Helicoptero){
            Helicoptero h = (Helicoptero) v;
            h.realizarRescate();
            //((Helicoptero)v).realizarRescate();
        } else if(v instanceof Avion){
            ((Avion) v).transportarPasajeros();
        }
        System.out.println();
    }

    // This method uses patter matching
    public static void llevarGente2(VehiculoAereo v){
        if(v instanceof Helicoptero h){
            h.realizarRescate();
        }else if(v instanceof Avion a){
            a.transportarPasajeros();
        }
    }
}
