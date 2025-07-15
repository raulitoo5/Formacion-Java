import disenioClases.Triangulo;

public class PintaFigura {

    public void pintar(Linea l){
        System.out.println("*".repeat(l.getLongitud()));
    }

    public void pintar(Triangulo t){
        for(int i=1; i<=t.getLado(); i++){
            System.out.print(" ".repeat(t.getLado()- i));
            System.out.print("*".repeat(2*i - 1));
            System.out.println();
        }
    }

    public void pintar(Rectangulo r){
        int base = (int) Math.round(r.base());
        int altura = (int) Math.round(r.altura());

        String pintura = "*";
        System.out.print(pintura.repeat(base));

        if(altura > 2){
            for(int i = 0; i<altura-2; i++){
                System.out.print(pintura);
                if(base > 2){
                    System.out.print(" ".repeat(base - 2));
                }
                System.out.println(pintura);
            }
        }

        System.out.println(pintura.repeat(base));
    }
}
