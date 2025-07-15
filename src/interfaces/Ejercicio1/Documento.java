package interfaces.Ejercicio1;

public abstract non-sealed class Documento implements Validable{

    protected long tamBytes;

    public Documento() {
    }

    public Documento(int tamBytes) {
        this.tamBytes = tamBytes;
    }

    public long getTamBytes() {
        return tamBytes;
    }

    public void setTamBytes(long tamBytes) {
        this.tamBytes = tamBytes;
    }

}
