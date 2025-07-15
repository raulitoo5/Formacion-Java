package interfaces.HerenciaInterfaces.Simple;

public class PersonajeAccion implements PuedeLuchar, PuedeVolar{

    @Override
    public void Luchar() {
        System.out.println("Luchando...");
    }

    @Override
    public void volar() {
        System.out.println("Volando...");
    }

    @Override
    public void saltar() {
        System.out.println("Saltando...");
    }
}
