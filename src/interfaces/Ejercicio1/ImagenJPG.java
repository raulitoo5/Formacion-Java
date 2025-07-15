package interfaces.Ejercicio1;

public class ImagenJPG extends Imagenes{

    public ImagenJPG(long alto, long ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public boolean isValid() {

        // When we use _ in numbers, it only serves as a thousands separator.
        // 5_000_000 is the same as 5000000.

        return ancho*alto <= 5_000_000;

    }


}
