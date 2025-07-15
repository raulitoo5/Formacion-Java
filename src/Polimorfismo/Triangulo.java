package Polimorfismo;

public class Triangulo extends Poligono{
    private int lado;

    public Triangulo() {
    }

    public Triangulo(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    // The @Override annotation indicates that this method in the subclass
    // is intended to override a method with the same signature in the superclass.
    // It helps the compiler catch mistakes like typos or incorrect parameters.

    @Override
    public void pintar(){
        for(int i=1; i<=this.lado; i++){
            System.out.print(" ".repeat(this.lado- i));
            System.out.print("*".repeat(2*i - 1));
            System.out.println();
        }
        System.out.println();
    }
}
