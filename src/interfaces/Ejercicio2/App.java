package interfaces.Ejercicio2;

public class App {
    public static void main(String[] args){
        Producto p1 = new Producto("Tornillo", "Ferretería", 0.5);
        Producto p2 = new Producto("Martillo", "Herramienta", 10.0);
        Servicio servicio1 = new Servicio(120,"Pintura de paredes", "PINTURA");
        Servicio servicio2 = new Servicio(60, "Reparación eléctrica", "ELECTRICIDAD");

        Vendible[] elementos = {p1,p2,servicio1, servicio2};

        Factura factura = new Factura(elementos, "Raúl");

        double total = factura.calcularTotal();
        System.out.println("Total de la factura: " + total + "€");
    }
}
