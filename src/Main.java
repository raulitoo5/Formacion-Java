import disenioClases.Triangulo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            // INTRODUCCIÓN A LA ORIENTACIÓN A OBJETOS
            // *****************************************************************

            Coche coche = new Coche("Ford", "Focus", 2023, 0, 45);

            coche.arrancar();

            Coche coche2 = new Coche("Seat", "Ibiza");
            coche2.arrancar();
            coche2.repostar(59);
            coche2.arrancar();

            coche2.viajar(60);

            System.out.println(coche2);



            // EJERCICIO 1
            // *********************************************************************


            Alumno a1 = new Alumno();
            a1.setNombre("Raul");
            a1.setApellidos("Concha");
            a1.setEdad(14);
            a1.setEmail("raulafaj@ajdñaj");

            System.out.println(a1);

            Alumno a2 = new Alumno("maria", "fernandez", 18);
            a2.setEmail("jañfjafñ@jfañdf");
            a2.setTelefono("48u45");

            System.out.println(a2);

            System.out.println("La alumna %s %s %s mayor de edad".formatted(a2.getNombre(), a2.getApellidos(), a2.esMayor18() ? "sí" : "no"));

            if(a1.equals(a2)){
                    System.out.println("Son el mismo objeto");
            }{
                    System.out.println("No son el mismo objeto");
            }

            var alumnos = new Alumno[5];

            alumnos[0] = new Alumno("jose", "martin", 14);
            alumnos[1] = new Alumno("Alex", "Cruz", 16);
            alumnos[2] = new Alumno("Maria", "martinez", 10);
            alumnos[3] = new Alumno("Ana", "donaire", 23);
            alumnos[4] = new Alumno("Martin", "martin", 14);

            Alumno alumnoMasJoven = alumnos[0];

            System.out.println("El tamaño del array es: %d".formatted(alumnos.length));
            // Empezamos en 1 porque el 0 ya lo hemos cogido el primero
            for(int i=1; i<alumnos.length; i++){
                    if(alumnos[i].getEdad() < alumnoMasJoven.getEdad()){
                            alumnoMasJoven = alumnos[i];
                    }
            }

            System.out.println("El almuno mas joven es %S %s con %d años".formatted(alumnoMasJoven.getNombre(), alumnoMasJoven.getApellidos(), alumnoMasJoven.getEdad()));




            // ARGUMENTOS Y TIPOS DE RETORNO
            // *********************************************************************



            double[] punto1 = new double[] {0,0};
            double[] punto2 = new double[] {10,0};
            double[] punto3 = new double[] {10,10};
            double[] punto4 = new double[] {0,10};

            Rectangulo r1 = new Rectangulo(punto1,punto2, punto3, punto4);
            System.out.println(r1);
            r1.dibujar('*');

            Rectangulo r2 = new Rectangulo(punto1, punto2, punto3, punto4);
            r2.dibujar(r1,r2);


            // PASO POR VALOR Y POR REFERENCIA
            // *********************************************************************



//            PasoPorValor p = new PasoPorValor();
//            int n = 7;
//            p.incrementar(n);
//            System.out.println(n);

            ClaseCualquiera c = new ClaseCualquiera();
            PasoPorValor p = new PasoPorValor();

            System.out.println(c);
            p.incrementar(c);
            System.out.println(c);




            // SOBRECARGA DE MÉTODOS
            // *********************************************************************

            PintaFigura pinta = new PintaFigura();

            Linea l = new Linea(20);
            pinta.pintar(l);

            Triangulo t = new Triangulo(10);
            pinta.pintar(t);

            Rectangulo r = new Rectangulo(10, 5);
            pinta.pintar(r);


    }
    }