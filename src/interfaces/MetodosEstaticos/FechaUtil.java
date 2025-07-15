package interfaces.MetodosEstaticos;

public interface FechaUtil {

    public static String formatearFecha( int dia, int mes, int anio){
        boolean esFechaValida = true;

        if(anio < 1 || anio > 9999){
            esFechaValida = false;
        }

        if(mes < 1 || mes > 12){
            esFechaValida = false;
        }

        if( dia < 1 || dia > 31){
            esFechaValida = false;
        } else{
            if(mes == 2){
                if(dia > 29){
                    esFechaValida = false;
                } else if (dia == 29){
                    boolean esBisiesto = (anio %4 == 0 && anio%100 !=0) || (anio %400==0);
                    if(!esBisiesto)
                        esFechaValida = false;
                }
            } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                if(dia > 30){
                    esFechaValida = false;
                }
            }
        }

        if(!esFechaValida)
            return "Fecha no válida";
        else
            return "%02d/%02d/%04d".formatted(dia,mes,anio);

    }
}
