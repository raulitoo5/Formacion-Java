package interfaces.HerenciaInterfaces.Sellada;

public final class CocheGasolina extends Coche implements MotorGasolina{

    @Override
    public void aceptarAireYCombustible() {
        System.out.println("Accepting at the same time the air and the fuel into the engine");
    }
}
