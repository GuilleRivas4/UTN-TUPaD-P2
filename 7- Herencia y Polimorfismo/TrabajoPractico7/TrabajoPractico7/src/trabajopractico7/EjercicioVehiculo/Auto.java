

package trabajopractico7.EjercicioVehiculo;


public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Marca:" + marca + " Modelo:" + modelo + " Cantidad puertas:" + cantidadPuertas);
    }
    

}
