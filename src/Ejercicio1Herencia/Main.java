package Ejercicio1Herencia;

import composicion.Habitacion;

public class Main {
    public static void main(String[] args){
        Local l1 = new Local(1, "Calle", 250000.0, 110, true);

        System.out.println(l1);

        Casa c1 = new Casa();
        c1.setIdentificacionInmobiliario(2);
        c1.setDireccion("Calle 2");
        c1.setPrecioVenta(150000);
        c1.setMetrosCuadrado(70);
        c1.setnBanios(2);
        c1.addHabitacion(new Habitacion(13, "Dormitorio"));
        c1.addHabitacion(new Habitacion(16, "Dormitorio"));
        c1.addHabitacion(new Habitacion(18, "Salón"));
        c1.setnPlantasAltura(1);

        System.out.println(c1);

    }
}
