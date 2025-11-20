

package trabajopractico7.EjerciciosFiguras;


public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
       double area = radio * Math.PI;
        System.out.println(nombre + ": " + area);
    }
    
    

}
