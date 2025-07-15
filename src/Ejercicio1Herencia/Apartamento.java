package Ejercicio1Herencia;

import composicion.Habitacion;

public final class Apartamento extends InmuebleVivienda{

    public Apartamento(){}

    public Apartamento(int identificacion, String direccion, double precio, double metros, int nHabitaciones, int nBanios, Habitacion[] habitaciones) {
        super(identificacion, direccion, precio, metros, nHabitaciones, nBanios, habitaciones);
    }
}
