package Herencia;

public class Animal {
    private int estatura;
    private double peso;
    private String raza;

    public Animal(int estatura, String raza, double peso) {
        this.estatura = estatura;
        this.raza = raza;
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "estatura=" + estatura +
                ", peso=" + peso +
                ", raza='" + raza + '\'' +
                '}';
    }
}
