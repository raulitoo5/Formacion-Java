package Ejercicio1Herencia;

import composicion.Habitacion;

public final class Apartamento extends InmuebleVivienda{

    public Apartamento(){}

    public Apartamento(int identificacion, String direccion, double precioBase, double metros, int nHabitaciones, int nBanios, Habitacion[] habitaciones) {
        super(identificacion, direccion, precioBase, metros, nHabitaciones, nBanios, habitaciones);
    }
}
