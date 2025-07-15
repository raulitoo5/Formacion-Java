package interfaces.Ejercicio2;

public class Factura {

    private String cliente;
    private Vendible[] elementos;

    public Factura(Vendible[] elementos, String cliente) {
        this.elementos = elementos;
        this.cliente = cliente;
    }

    public double calcularTotal(){
        double total = 0.0;
        for(Vendible v: elementos){
            total += v.getPrecio();
        }
        return total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Vendible[] getElementos() {
        return elementos;
    }

    public void setElementos(Vendible[] elementos) {
        this.elementos = elementos;
    }
}
