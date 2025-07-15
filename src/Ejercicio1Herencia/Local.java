package Ejercicio1Herencia;

import java.util.Objects;

public final class Local extends Inmueble{

    private boolean tieneSalidaHumo;

    public Local(){}

    public Local(int identificacion, String direccion, double precio,
                 double metros, boolean salidaHumo) {
        super(identificacion, direccion, precio, metros);
        this.tieneSalidaHumo = salidaHumo;
    }

    public boolean isTieneSalidaHumo() {
        return tieneSalidaHumo;
    }

    public void setTieneSalidaHumo(boolean tieneSalidaHumo) {
        this.tieneSalidaHumo = tieneSalidaHumo;
    }

    public void precioFinal(int impuesto){
        this.precioVenta = precioVenta + (precioVenta*(impuesto/100));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Local local = (Local) o;
        return tieneSalidaHumo == local.tieneSalidaHumo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tieneSalidaHumo);
    }

    @Override
    public String toString() {
        return "Local{" +
                "tieneSalidaHumo=" + tieneSalidaHumo +
                ", identificacionInmobiliario=" + identificacionInmobiliario +
                ", direccion='" + direccion + '\'' +
                ", precioVenta=" + precioVenta +
                ", metrosCuadrado=" + metrosCuadrado +
                '}';
    }
}
