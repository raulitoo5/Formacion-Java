package Estadistica;

public class Ejercicio1 {
    public static void main(String[] args){
        int[] numeros = new int[] {1,2,2,3,4,5,6,7,8,9};
        Muestra m1 = new Muestra(numeros);
        m1.agregarNumero(123);

        double media = Estadistica.media(m1);
        double moda = Estadistica.moda(m1);

        System.out.println("La media es: " + media);
        System.out.println("La moda es: " + moda);
    }
}
