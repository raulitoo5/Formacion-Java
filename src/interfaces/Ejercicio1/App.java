package interfaces.Ejercicio1;

public class App {
    public static void main(String[] args){
        Documento d1 = new DocumentoPDF(12345);
        Documento d2 = new DocumentoPDF(122345342);

        Imagenes im = new ImagenJPG(2500, 900);

        Videos v = new VideoMP4(123);

        Validable[] array = {d1,d2,im,v};

        ServicioValidacion servicioValidacion = new ServicioValidacion(array);

        if(servicioValidacion.validarTodos()){
            System.out.println("Todos los ficheros son validos");
        } else{
            System.out.println("Hay un fichero que no es válido");
        }

    }
}
