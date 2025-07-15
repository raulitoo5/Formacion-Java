package interfaces;

public class DibujadorDeFiguras {

    // When we accept an interface as a parameter, we declare that this method
    // expects an object that implements the Dibujable interface.
    public static void dibujaFiguras(Dibujable d) {
        d.dibujar();
    }
}
