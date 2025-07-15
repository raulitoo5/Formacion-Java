package clasesAbstractas;

public class Coche extends Vehiculo{

    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima){
        super(marca, modelo);
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarVelocidadMaxima(){
        System.out.println("Velocidad maxima: " + velocidadMaxima);
    }

    @Override
    public void conducir(){
        System.out.println("Conduciendo un coche");
    }
}
