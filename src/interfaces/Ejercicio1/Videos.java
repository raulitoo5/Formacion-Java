package interfaces.Ejercicio1;

public abstract non-sealed class Videos implements Validable{

    protected int duracionSegundos;

    public Videos() {
    }

    public Videos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }
}
