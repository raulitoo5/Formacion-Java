package clasesAbstractas;

public abstract class VehiculoAereo extends Vehiculo{

    private int alturaMaxima;

    public VehiculoAereo(String marca, String modelo, int alturaMaxima){
        super(marca,modelo);
        this.alturaMaxima = alturaMaxima;
    }

    @Override
    public void conducir(){
        System.out.println("Realmente se llama pilotar");
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Altura máxima: " + alturaMaxima);
    }

    public abstract void despegar();
    public abstract void aterrizar();
}
