package composicion;

public class App {
    public static void main(String[] args){
        Casa miCasa = new Casa();
        miCasa.agregarHabitacion(new Habitacion(1, "Dormitorio"));
        miCasa.agregarHabitacion(new Habitacion(2, "baño"));
        miCasa.agregarHabitacion(new Habitacion(3, "jardin"));
    }
}
