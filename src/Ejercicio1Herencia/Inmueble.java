package Ejercicio1Herencia;

import java.util.Objects;

public abstract sealed class Inmueble permits InmuebleVivienda, Local{

    // I have set the attributes as protected because we want the subclasses
    // to be able to access them.
    protected int identificacionInmobiliario;
    protected String direccion;
    protected double precioVenta;
    protected double metrosCuadrado;

    // Empty constructor
    public Inmueble(){}

    public Inmueble(int identificacion, String direccion, double precio, double metros){
        this.identificacionInmobiliario = identificacion;
        this.direccion = direccion;
        this.precioVenta = precio;
        this.metrosCuadrado = metros;
    }

    public int getIdentificacionInmobiliario() {
        return identificacionInmobiliario;
    }

    public void setIdentificacionInmobiliario(int identificacionInmobiliario) {
        this.identificacionInmobiliario = identificacionInmobiliario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getMetrosCuadrado() {
        return metrosCuadrado;
    }

    public void setMetrosCuadrado(double metrosCuadrado) {
        this.metrosCuadrado = metrosCuadrado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inmueble inmueble = (Inmueble) o;
        return identificacionInmobiliario == inmueble.identificacionInmobiliario && Double.compare(precioVenta, inmueble.precioVenta) == 0 && Double.compare(metrosCuadrado, inmueble.metrosCuadrado) == 0 && Objects.equals(direccion, inmueble.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificacionInmobiliario, direccion, precioVenta, metrosCuadrado);
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "identificacionInmobiliario=" + identificacionInmobiliario +
                ", direccion='" + direccion + '\'' +
                ", precioVenta=" + precioVenta +
                ", metrosCuadrado=" + metrosCuadrado +
                '}';
    }

    //    @Override
//    public String toString(){
//        return "Inmueble: {Idenficacion: " +this.identificacionInmobiliario + "direccion: " + this.direccion + "precio: " + this.precioVenta + "metros cuadrados: " + this.metrosCuadrado;
//    }
}
