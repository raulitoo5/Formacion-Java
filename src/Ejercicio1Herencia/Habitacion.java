package Ejercicio1Herencia;

import java.util.Objects;

public class Habitacion {
    private double metrosCuadrados;
    private int nVentanas;
    private String use;

    public Habitacion(){}

    public Habitacion(double metrosCuadrados, int nVentanas, String use) {
        this.metrosCuadrados = metrosCuadrados;
        this.nVentanas = nVentanas;
        this.use = use;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getnVentanas() {
        return nVentanas;
    }

    public void setnVentanas(int nVentanas) {
        this.nVentanas = nVentanas;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Habitacion that = (Habitacion) o;
        return Double.compare(metrosCuadrados, that.metrosCuadrados) == 0 && nVentanas == that.nVentanas && Objects.equals(use, that.use);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metrosCuadrados, nVentanas, use);
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "metrosCuadrados=" + metrosCuadrados +
                ", nVentanas=" + nVentanas +
                ", use='" + use + '\'' +
                '}';
    }
}
