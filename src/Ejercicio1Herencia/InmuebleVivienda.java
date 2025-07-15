package Ejercicio1Herencia;

import composicion.Habitacion;

import java.util.Arrays;
import java.util.Objects;

public abstract sealed class InmuebleVivienda extends Inmueble permits Casa, Apartamento{

    private static final int MIN_SIZE_HABITACION = 3;
    public static final int IVA = 21;

    protected int nHabitaciones;
    protected int nBanios;
    protected Habitacion[] habitaciones;

    // We can't create this constructor because the superclass has a constructor with arguments.
    // This means the no-argument constructor is no longer available in the superclass,
    // so the compiler doesn't recognize a no-argument constructor in InmuebleVivienda.

//    public InmuebleVivienda(){}



    // Now I have created the empty constructor in the superclass,
    // so we are able to create the empty constructor in this class.

    public InmuebleVivienda(){
        super();
        this.habitaciones = new Habitacion[MIN_SIZE_HABITACION];
        this.nHabitaciones = 0;
    }


    public InmuebleVivienda(int identificacion, String direccion, double precioBase, double metros, int nHabitaciones, int nBanios, Habitacion[] habitaciones){
        super(identificacion,direccion,precioBase,metros);
        this.nHabitaciones = nHabitaciones;
        this.nBanios = nBanios;

    // We have to use .clone() because if we don’t, we’re assigning the same object.
    // This means that changing one will also change the other.
    // By using .clone(), we avoid this issue by creating a separate copy.
        this.habitaciones = habitaciones.clone();
    }

    public int getnHabitaciones() {
        return nHabitaciones;
    }

    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    public int getnBanios() {
        return nBanios;
    }

    public void setnBanios(int nBanios) {
        this.nBanios = nBanios;
    }

    public Habitacion[] getHabitaciones() {
    // We use .clone() because otherwise the method would return the original object, not a copy.
    // This means that any code calling the method would have direct access to the internal array,
    // and could modify its contents from outside the class.
    // Using .clone() creates a separate copy of the array, which helps protect the internal state
    // of the object and ensures encapsulation.
        return habitaciones.clone();
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void addHabitacion(Habitacion h){
        if(this.nHabitaciones == habitaciones.length){
            habitaciones = Arrays.copyOf(habitaciones, habitaciones.length+1);
        }
        habitaciones[this.nHabitaciones++] = h;
    }

    public void removeHabitacion(int index){
        if(index > 0 && index < habitaciones.length){
            this.habitaciones[index] = null;
            for(int i = index; i<habitaciones.length-1; i++){
                habitaciones[i] = habitaciones[i+1];
            }
        }
    }

    public double precioFinal(){
        return this.precioBase * (1 + (IVA/100.0));
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InmuebleVivienda that = (InmuebleVivienda) o;
        return nHabitaciones == that.nHabitaciones && nBanios == that.nBanios && Objects.deepEquals(habitaciones, that.habitaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nHabitaciones, nBanios, Arrays.hashCode(habitaciones));
    }

    @Override
    public String toString() {
        return "InmuebleVivienda{" +
                "nHabitaciones=" + nHabitaciones +
                ", nBanios=" + nBanios +
                ", habitaciones=" + Arrays.toString(habitaciones) +
                ", identificacionInmobiliario=" + identificacionInmobiliario +
                ", precioBase=" + precioBase +
                ", metrosCuadrado=" + metrosCuadrado +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
