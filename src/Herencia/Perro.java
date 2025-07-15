package Herencia;

public class Perro extends Animal {
    public Perro(int estatura, double peso, String raza){
        super(estatura, raza, peso);
    }

    public void ladrar(){
        System.out.println("Gua guau guau...");
    }

    public void presentar(){
        System.out.println("Hola, soy un perro de raza %s y peso %.2f kilos".formatted(getRaza(), getPeso()));
    }
}
