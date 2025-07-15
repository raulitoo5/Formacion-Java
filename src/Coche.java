import java.util.Objects;

public class Coche {
     private String modelo;
     private String marca;
     private int anio;
     private double velocidadActual;
     private double litrosEnDeposito;


     public Coche() {}

     public Coche( String marca, String modelo, int anio, double velocidadActual, double litrosEnDeposito){
          this.marca = marca;
          this.modelo = modelo;
          this.anio = anio;
          this.velocidadActual = velocidadActual;
          this.litrosEnDeposito = litrosEnDeposito;
     }

     public Coche(String marca, String modelo){
          this(marca,modelo, 2020, 0, 0);
     }

     public Coche(String marca, int anio){
          this(marca, null, anio, 0, 0);
     }

     public void setMarca(String marca){
          this.marca = marca;
     }

     public String getMarca(){
          return this.marca;
     }

     public int getAnio() {
          return anio;
     }

     public void setAnio(int anio) {
          this.anio = anio;
     }

     public String getModelo() {
          return modelo;
     }

     public void setModelo(String modelo) {
          this.modelo = modelo;
     }

     public double getVelocidadActual() {
          return velocidadActual;
     }

     public void setVelocidadActual(double velocidadActual) {
          this.velocidadActual = velocidadActual;
     }

     public double getLitrosEnDeposito() {
          return litrosEnDeposito;
     }

     public void setLitrosEnDeposito(double litrosEnDeposito) {
          this.litrosEnDeposito = litrosEnDeposito;
     }



     public void arrancar(){
          if(litrosEnDeposito > 0){
               System.out.println("El coche %s %s %d ha arrancado".formatted(marca,modelo,anio));
          }
          else{
               System.out.println("El coche tiene el depósito vacío");
          }
     }

     public double repostar(double cantidad){
          if (cantidad < 0) {
               throw new IllegalArgumentException("cantidad no puede ser negativa");
          }

          this.litrosEnDeposito += cantidad;
          return litrosEnDeposito;
     }

     public void acelerar (double incremento){
          this.velocidadActual += incremento;
     }

     public double viajar (double kilometraje){
          // Comprobamos que el coche puede hacer el viaje
          if(kilometraje*0.7 <= litrosEnDeposito){
               double tiempoEnHoras = kilometraje/velocidadActual;
               double tiempoEnSegundos = (kilometraje/velocidadActual)*3600;
               this.litrosEnDeposito -= kilometraje*0.7;
               System.out.println("Tras el viaje el deposito ha quedado con %.2f litros".formatted(litrosEnDeposito));

               return tiempoEnSegundos;
          } else{
               System.out.println("No se puede hacer el viaje");
               return 0;
          }
     }

     @Override
     public boolean equals(Object o) {
          if (o == null || getClass() != o.getClass()) return false;
          Coche coche = (Coche) o;
          return anio == coche.anio && Double.compare(velocidadActual, coche.velocidadActual) == 0 && Double.compare(litrosEnDeposito, coche.litrosEnDeposito) == 0 && Objects.equals(modelo, coche.modelo) && Objects.equals(marca, coche.marca);
     }

     @Override
     public int hashCode() {
          return Objects.hash(modelo, marca, anio, velocidadActual, litrosEnDeposito);
     }

     @Override
     public String toString() {
          return "Coche{" +
                  "modelo='" + modelo + '\'' +
                  ", marca='" + marca + '\'' +
                  ", anio=" + anio +
                  ", velocidadActual=" + velocidadActual +
                  ", litrosEnDeposito=" + litrosEnDeposito +
                  '}';
     }
}
