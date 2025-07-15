package Agregacion;

import java.util.Arrays;

public class CarritoCompra {

    private Producto[] productos;
    private int cantidadProductos;

    public CarritoCompra(){
        productos = new Producto[25];
        cantidadProductos = 0;
    }

    public Producto[] getProductos(){
        return Arrays.copyOf(productos, cantidadProductos);
    }

    public void addProducto(Producto p){
        // Using cantidadProductos++ first, the product 'p' is assigned to the position 'cantidadProductos'.
        // Then, the variable 'cantidadProductos' is incremented.
        productos[cantidadProductos++] = p;
    }

    // The difference between assigning null to the array (array = null)
    // and setting each element to null one by one is that:
    // with the first way, you can no longer use the array,
    // while with the second, you can still use the array (but it's empty).

    public void vaciarCarrito() {
        for(int i=0; i<productos.length; i++){
            productos[i] = null;
        }

        cantidadProductos = 0;
    }
}
