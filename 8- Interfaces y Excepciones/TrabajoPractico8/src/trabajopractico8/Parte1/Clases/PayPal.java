

package trabajopractico8.Parte1.Clases;

import trabajopractico8.Parte1.Interfaces.Pago;


public class PayPal implements Pago {
    private double saldoDisponible;

    public PayPal(double saldoInicial) {
        this.saldoDisponible = saldoInicial;
    }

    @Override
    public boolean procesarPago(double monto) {
        if (this.saldoDisponible >= monto) {
            this.saldoDisponible -= monto; // Descontar el dinero
            System.out.printf("Pago con PayPal de $%.2f procesado. Saldo restante: $%.2f%n", monto, this.saldoDisponible);
            return true;
        } else {
            System.out.printf("Pago con PayPal FALLIDO. Saldo insuficiente (Necesario: $%.2f, Disponible: $%.2f)%n", monto, this.saldoDisponible);
            return false;
        }
    }
}
