package Estadistica;

import java.util.Arrays;

public class Muestra {

    public static final int DEFAULT_SIZE = 10;

    private int[] numeros;
    private int cantidadNumeros;

    public Muestra(){
        numeros = new int[DEFAULT_SIZE];
        cantidadNumeros = 0;
    }

    public Muestra(int cantidad){
        this.cantidadNumeros = cantidad;
        numeros = new int[cantidadNumeros];
    }

    public Muestra (int[] array){
        this.numeros = array.clone();
        this.cantidadNumeros = array.length;
    }

    public void agregarNumero (int n){

    // Before adding an element, check if the array is full.
    // If it is, double its size and copy over the old elements.
    // Then we can safely add the new element.
        if(cantidadNumeros == numeros.length){
            agrandarArray();
        }

        numeros[cantidadNumeros] = n;
        cantidadNumeros ++;
    }

    private void agrandarArray(){
        int[] copiaNumeros = numeros.clone();
    // The purpose of copyOf is to copy the array passed as the first argument.
    // The second argument sets the size of the new array.

        numeros = Arrays.copyOf(copiaNumeros, copiaNumeros.length + DEFAULT_SIZE);
    }

    public int[] getNumeros() {
        return numeros;
    }

    public int getCantidadNumeros() {
        return cantidadNumeros;
    }
}
