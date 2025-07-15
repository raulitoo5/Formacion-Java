package Ejercicio1Herencia;

import java.util.Objects;

public final class Local extends Inmueble{

    private boolean tieneSalidaHumo;
    private double porcentajePlusvalia;

    public Local(){}

    public Local(int identificacion, String direccion, double precioBase,
                 double metros, boolean salidaHumo, double porcentajePlusvalia) {
        super(identificacion, direccion, precioBase, metros);
        this.tieneSalidaHumo = salidaHumo;
        this.porcentajePlusvalia = porcentajePlusvalia;
    }

    public boolean isTieneSalidaHumo() {
        return tieneSalidaHumo;
    }

    public void setTieneSalidaHumo(boolean tieneSalidaHumo) {
        this.tieneSalidaHumo = tieneSalidaHumo;
    }

    public double precioFinal(int impuesto){
        return this.precioBase = precioBase + (precioBase *(impuesto/100));
    }

    public double getPorcentajePlusvalia() {
        return porcentajePlusvalia;
    }

    public void setPorcentajePlusvalia(double porcentajePlusvalia) {
        this.porcentajePlusvalia = porcentajePlusvalia;
    }

    public double precioFinal(){
        return this.precioBase * (1 + this.getPorcentajePlusvalia());
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
                ", precioVenta=" + precioBase +
                ", metrosCuadrado=" + metrosCuadrado +
                '}';
    }
}
