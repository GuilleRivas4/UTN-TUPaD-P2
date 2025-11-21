

package trabajopractico8.Parte1.Clases;

import trabajopractico8.Parte1.Interfaces.PagoConDescuento;


public class TarjetaCredito implements PagoConDescuento {
    private double tasaDescuento = 0.05;
    private double saldoDisponible;

    public TarjetaCredito(double saldoInicial) {
        this.saldoDisponible = saldoInicial;
    }

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * tasaDescuento;
        return monto - descuento;
    }

    @Override
    public boolean procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);

        if (this.saldoDisponible >= montoFinal) {
            this.saldoDisponible -= montoFinal; // Descontar el dinero
            System.out.printf("Pago con Tarjeta (Descuento aplicado) de $%.2f procesado. Saldo restante: $%.2f%n", montoFinal, this.saldoDisponible);
            return true;
        } else {
            System.out.printf("Pago con Tarjeta FALLIDO. Saldo insuficiente (Necesario: %.2f€, Disponible: $%.2f)%n", montoFinal, this.saldoDisponible);
            return false;
        }
    }
    
}
