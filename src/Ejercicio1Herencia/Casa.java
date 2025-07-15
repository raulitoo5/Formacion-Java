package Ejercicio1Herencia;

import composicion.Habitacion;

import java.util.Arrays;
import java.util.Objects;

public final class Casa extends InmuebleVivienda{
    private int nPlantasAltura;

    public Casa(){ }

    public Casa(int identificacion, String direccion, double precioBase, double metros, int nHabitaciones, int nBanios, Habitacion[] habitaciones, int nPlantasAltura) {
        super(identificacion, direccion, precioBase, metros, nHabitaciones, nBanios, habitaciones);
        this.nPlantasAltura = nPlantasAltura;
    }

    public int getnPlantasAltura() {
        return nPlantasAltura;
    }

    public void setnPlantasAltura(int nPlantasAltura) {
        this.nPlantasAltura = nPlantasAltura;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Casa casa = (Casa) o;
        return nPlantasAltura == casa.nPlantasAltura;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nPlantasAltura);
    }

    @Override
    public String toString() {
        return "Casa{" +
                "nPlantasAltura=" + nPlantasAltura +
                ", identificacionInmobiliario=" + identificacionInmobiliario +
                ", direccion='" + direccion + '\'' +
                ", precioBase=" + precioBase +
                ", metrosCuadrado=" + metrosCuadrado +
                ", habitaciones=" + Arrays.toString(habitaciones) +
                ", nBanios=" + nBanios +
                ", nHabitaciones=" + nHabitaciones +
                '}';
    }
}
