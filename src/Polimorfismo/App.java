package Polimorfismo;

public class App {
    public static void main(String[] args){
        Poligono p = new Poligono();
        Poligono t = new Triangulo(5);
        Poligono r = new Rectangulo(10, 5);

        PintaFiguras.pintar(p);
        PintaFiguras.pintar(t);
        PintaFiguras.pintar(r);

        Poligono [] array = new Poligono[] {p,r,t};
        for(Poligono p2: array){
            PintaFiguras.pintar(p2);
        }
    }
}
