package interfaces.Ejercicio1;

public sealed interface Validable permits Documento, Imagenes, Videos {

    boolean isValid();
}
