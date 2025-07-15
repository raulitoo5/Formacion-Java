package interfaces;

public class App {
    public static void main(String[] args){
        Recta r1 = new Recta(5);
        Cuadrado c1 = new Cuadrado(3);
        Dibujable r2 = new Recta(6);

        DibujadorDeFiguras.dibujaFiguras(r1);
        DibujadorDeFiguras.dibujaFiguras(c1);
        DibujadorDeFiguras.dibujaFiguras(r2);

        Loggable logger = new ConsoleLoggerInverse();
        String mensaje = "Hola mundo";
        logger.log(mensaje);
        String[] arr = new String[] {"Mensaje 1", "Mensaje 2", "Mensaje 3"};
        logger.logArray(arr);
    }
}
