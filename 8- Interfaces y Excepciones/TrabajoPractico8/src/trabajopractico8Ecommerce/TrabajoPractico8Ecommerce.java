
package trabajopractico8Ecommerce;

import trabajopractico8.Parte1.Clases.Cliente;
import trabajopractico8.Parte1.Clases.PayPal;
import trabajopractico8.Parte1.Clases.Pedido;
import trabajopractico8.Parte1.Clases.Producto;
import trabajopractico8.Parte1.Clases.TarjetaCredito;

public class TrabajoPractico8Ecommerce {

    
    public static void main(String[] args) {
        Producto lapiz = new Producto("Lápiz", 1.50);
        Producto cuaderno = new Producto("Cuaderno A4", 5.00);
        Producto mochila = new Producto("Mochila Ergonómica", 45.00);

        Cliente juan = new Cliente("Juan Pérez", "juan@mail.com");
        System.out.println("--- PEDIDO 1 (Juan) ---");
        Pedido pedidoJuan = new Pedido(juan); 
        pedidoJuan.agregarProducto(lapiz);
        pedidoJuan.agregarProducto(cuaderno);
        pedidoJuan.agregarProducto(mochila);

        double subtotalJuan = pedidoJuan.calcularTotal(); 
        System.out.println("Subtotal del pedido: $" + subtotalJuan);
        
        TarjetaCredito pagoTarjeta = new TarjetaCredito(100.00); // Saldo inicial: 100€
        
        System.out.println("\n--- PAGO CON TARJETA (ÉXITO) ---");
        pedidoJuan.finalizarPago(pagoTarjeta);
        
        Cliente maria = new Cliente("María García", "maria@mail.com");
        System.out.println("\n--- PEDIDO 2 (María) ---");
        Pedido pedidoMaria = new Pedido(maria);
        pedidoMaria.agregarProducto(new Producto("Libro Java", 30.00));
        pedidoMaria.agregarProducto(new Producto("Monitor", 200.00));
        
        double subtotalMaria = pedidoMaria.calcularTotal(); 
        System.out.println("Subtotal del pedido de María: $" + subtotalMaria);
        
        PayPal pagoPayPal = new PayPal(50.00); 
        
        System.out.println("\n--- PAGO CON PAYPAL (FALLIDO) ---");
        pedidoMaria.finalizarPago(pagoPayPal);
    }

}
