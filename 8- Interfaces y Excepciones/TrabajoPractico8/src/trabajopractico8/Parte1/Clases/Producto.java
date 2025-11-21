

package trabajopractico8.Parte1.Clases;

import trabajopractico8.Parte1.Interfaces.Pagable;


public class Producto implements Pagable{
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }    
    
    @Override
    public double calcularTotal() {
        return this.precio;
    }

}
