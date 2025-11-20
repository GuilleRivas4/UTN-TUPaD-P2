

package trabajopractico7.EjerciciosFiguras;


public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void calcularArea();
}
