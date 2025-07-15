package interfaces.HerenciaInterfaces.Sellada;

public sealed interface MotorDiesel extends Motor permits CocheDiesel{

    void aceptarAire();

    void aceptarCombustible();
}
