

package trabajopractico7.EjerciciosFiguras;


public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
       double area = base * altura;
        System.out.println(nombre + ": " + area);
    }
}
