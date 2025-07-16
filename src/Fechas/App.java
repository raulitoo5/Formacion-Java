package Fechas;

import Ejercicio1Herencia.Local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args){

        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);

        // Substract days to a date
        LocalDate ayer = hoy.minus(1, ChronoUnit.DAYS);
        System.out.println(ayer);

        // Add days to a date
        LocalDate manana = hoy.plusDays(1);
        System.out.println(manana);

        // Create an inmutable date
        LocalDate fechaFija = LocalDate.of(2010,07,10);
        System.out.println(fechaFija);

        // Create a date from a text
        LocalDate fechaTexto = LocalDate.parse("2020-01-01");
        System.out.println(fechaTexto);

        // Create a date from a text with a patter
        LocalDate fechaText2 = LocalDate.parse("05/07/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(fechaText2);

        String textoFecha = fechaText2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(textoFecha);

        if(hoy.isAfter(ayer)){
            System.out.println("Normal");
        }
    }
}

