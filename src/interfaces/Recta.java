package interfaces;

public class Recta implements Dibujable{

    private int longitud;

    public Recta(int l){
        this.longitud = l;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando...");
    }


}
