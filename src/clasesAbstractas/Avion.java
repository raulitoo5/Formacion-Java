package clasesAbstractas;

public class Avion extends VehiculoAereo{
    public Avion(String marca, String modelo, int alturaMaxima){
        super(marca, modelo, alturaMaxima);
    }

    @Override
    public void despegar() {
        System.out.println("El avión despega");
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión aterriza");
    }

    public void transportarPasajeros(){
        System.out.println("Transportando pasajeros");
    }
}
