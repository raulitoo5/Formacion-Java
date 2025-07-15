package interfaces.HerenciaInterfaces.Sellada;

public abstract sealed class Coche implements Motor permits CocheDiesel, CocheGasolina {

    @Override
    public void arrancar() {
        System.out.println("The car has started ");
    }

    @Override
    public void apagar() {
        System.out.println("The car has turned off");
    }
}
