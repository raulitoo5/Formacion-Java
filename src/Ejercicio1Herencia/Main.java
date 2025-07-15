package Ejercicio1Herencia;

import composicion.Habitacion;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        Local l1 = new Local(1, "Calle", 250000.0, 110, true, 0.07);

        Casa c1 = new Casa();
        c1.setIdentificacionInmobiliario(2);
        c1.setDireccion("Calle 2");
        c1.setPrecioBase(150000);
        c1.setMetrosCuadrado(70);
        c1.setnBanios(2);
        c1.addHabitacion(new Habitacion(13, "Dormitorio"));
        c1.addHabitacion(new Habitacion(16, "Dormitorio"));
        c1.addHabitacion(new Habitacion(18, "Salón"));
        c1.setnPlantasAltura(1);

        mostrarInfo(c1);
        mostrarInfo(l1);

    }

    public static void mostrarInfo(Inmueble i){
        if(i instanceof Local l){
            imprimirInformacionComun(l);
            System.out.println("¿Tiene salida de humos?: " + (l.isTieneSalidaHumo() ? "Sí" : "No"));
        } else if( i instanceof Casa c){
            imprimirInformacionComun(c);
            System.out.println("Número de habitaciones: " + c.getnHabitaciones() +
                    " plantas: " + c.getnPlantasAltura());
        } else if( i instanceof Apartamento a){
            imprimirInformacionComun(a);
            System.out.println("Número de habitaciones: " + a.getnHabitaciones());
        }

        System.out.println();
    }

    public static void imprimirInformacionComun(Inmueble i){
        System.out.println("La direccion es: " + i.getDireccion() + ", el precio final es: " +
                i.precioFinal() + "tamaño: " + i.getMetrosCuadrado());
    }
}
