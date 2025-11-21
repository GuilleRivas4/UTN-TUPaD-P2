

package trabajopractico8.Parte1.Clases;

import java.util.ArrayList;
import java.util.List;
import trabajopractico8.Parte1.Interfaces.Notificable;
import trabajopractico8.Parte1.Interfaces.Pagable;
import trabajopractico8.Parte1.Interfaces.Pago;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private Notificable cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "PENDIENTE";
        notificarCambioEstado();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCambioEstado();
    }

    private void notificarCambioEstado() {
        String mensaje = "El estado de tu pedido ha cambiado a: " + this.estado;
        cliente.notificar(mensaje);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal(); 
        }
        return total;
    }

    public boolean finalizarPago(Pago medioDePago) {
        double total = calcularTotal();
        
        System.out.println("\nIntentando procesar pago de $" + total);
        
        if (medioDePago.procesarPago(total)) {
            cambiarEstado("PAGADO");
            return true;
        } else {
            System.out.println("La transacción falló. El estado del pedido se mantiene como " + this.estado);
            return false;
        }
    }
}
