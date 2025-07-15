package interfaces.HerenciaInterfaces.Sellada;

public sealed interface Motor permits Coche, MotorDiesel, MotorGasolina{

    void arrancar();

    void apagar();
}
