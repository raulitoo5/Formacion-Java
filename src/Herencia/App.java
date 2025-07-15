package Herencia;

public class App {
    public static void main(String[] args){
        Perro p = new Perro(60, 28, "Perro Labrador");
        Gato g = new Gato(45, 6, "Gato montés");

        // Although we don´t have declare the toString method in this clases, dog and cat heredan from animal, so this objects
        // are using toString method from Animal Class
        System.out.println(p);
        System.out.println(g);

        p.ladrar();
        g.maullar();

        p.presentar();
    }
}
