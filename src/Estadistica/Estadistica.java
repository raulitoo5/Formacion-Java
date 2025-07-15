package Estadistica;

public class Estadistica {

    private static double media(int[] array, int cantidadN){
        double suma = 0;
        for(int i=0; i<cantidadN; i++){
            suma +=array[i];
        }
        return suma/cantidadN;
    }

    public static double media(int[] array){
        return media(array, array.length);
    }

    public static double media(Muestra m){
        return media(m.getNumeros(), m.getCantidadNumeros());
    }

//    public static double media(Muestra m){
//        double suma = 0.0;
//        for(int i=0; i<m.getCantidadNumeros(); i++){
//            suma += m.getNumeros()[i];
//        }
//
//        return suma/m.getCantidadNumeros();
//    }

    public static int moda(Muestra m){
        int moda = 0;
        int maxFrecuencia = 0;
        int n = m.getCantidadNumeros();
        int [] numeros = m.getNumeros();

        for (int i=0; i<m.getCantidadNumeros(); i++){
            int frecuencia = 0;
            for(int j=0; j<m.getCantidadNumeros(); j++){
                if(numeros[i] == numeros[j]){
                    frecuencia ++;
                    if(frecuencia > maxFrecuencia){
                        maxFrecuencia = frecuencia;
                        moda = numeros[i];
                    }
                }
            }
        }

        return moda;
    }


}
