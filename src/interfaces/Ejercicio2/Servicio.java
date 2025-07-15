package interfaces.Ejercicio2;

public class Servicio implements Vendible{

    private String nombre;
    private String tipo;
    private int duracion;

    public Servicio(int duracion, String nombre, String tipo) {
        this.duracion = duracion;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public double getPrecio() {
        double precioFinal = switch (tipo){
            case "PINTURA" -> this.getDuracion() * 0.75;
            case "ELECTRICIDAD" -> this.getDuracion() * 1.0;
            case "FONTANERIA" -> this.getDuracion() * 1.25;
            default -> this.getDuracion() * 1.5;
        };
        return precioFinal;
    }
}
