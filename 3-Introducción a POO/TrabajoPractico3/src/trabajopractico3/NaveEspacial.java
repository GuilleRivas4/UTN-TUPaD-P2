

package trabajopractico3;


public class NaveEspacial {
    private String nombre;
    private int combustible;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
        
    public void despegar(){
        System.out.println("3...2...1...¡Despegue!");
    }
    
    public void avanzar(int distancia){
        int consumo = distancia * 10;
        if (combustible > consumo){
            System.out.println(nombre + " avanzo " + distancia + " de distancia");
            combustible -= consumo;
        }else {
            System.out.println("Combustible insuficiente");
        }
    }
    
    public void recargarCombustible(int cantidad){
        if ((combustible + cantidad) > 100){
            System.out.println("La cantidad supera el limite de carga");
        } else {
            System.out.println("Se cargo correctamente");
            combustible += cantidad;
        }
    }
    
    public void mostrarEstado(){
        System.out.println(nombre + " tiene " + combustible + " combustible");
    }
}
