package interfaces.Ejercicio1;

public abstract non-sealed class Imagenes implements Validable {

    protected long ancho;
    protected long alto;

    public Imagenes() {
    }

    public Imagenes(long ancho, long alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public long getAncho() {
        return ancho;
    }

    public void setAncho(long ancho) {
        this.ancho = ancho;
    }

    public long getAlto() {
        return alto;
    }

    public void setAlto(long alto) {
        this.alto = alto;
    }

}
