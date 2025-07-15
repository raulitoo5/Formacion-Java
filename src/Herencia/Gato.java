package Herencia;

public class Gato extends Animal{
    public Gato(int estatura, double peso, String raza){
        super(estatura, raza, peso);
    }

    public void maullar(){
        System.out.println("Miau, miau...");
    }
}
