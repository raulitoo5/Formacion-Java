package interfaces.HerenciaInterfaces.Sellada;

public final class CocheDiesel extends Coche implements MotorDiesel{

    @Override
    public void aceptarCombustible() {
        System.out.println("Accepting fuel into the motor");
    }

    @Override
    public void aceptarAire() {
        System.out.println("Accepting air into the motor");
    }
}
