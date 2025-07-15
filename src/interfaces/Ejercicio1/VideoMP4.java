package interfaces.Ejercicio1;

public class VideoMP4 extends Videos{

    public VideoMP4(int duracion){
        this.duracionSegundos = duracion;
    }

    @Override
    public boolean isValid() {
        return this.duracionSegundos > 0 && this.duracionSegundos < 5*60;
    }
}
