
package trabajopractico7;

import java.util.ArrayList;
import trabajopractico7.EjercicioAnimales.Animal;
import trabajopractico7.EjercicioAnimales.Gato;
import trabajopractico7.EjercicioAnimales.Perro;
import trabajopractico7.EjercicioAnimales.Vaca;
import trabajopractico7.EjercicioEmpleados.Empleado;
import trabajopractico7.EjercicioEmpleados.EmpleadoPlanta;
import trabajopractico7.EjercicioEmpleados.EmpleadoTemporal;
import trabajopractico7.EjercicioVehiculo.Auto;
import trabajopractico7.EjerciciosFiguras.Circulo;
import trabajopractico7.EjerciciosFiguras.Figura;
import trabajopractico7.EjerciciosFiguras.Rectangulo;

public class TrabajoPractico7 {

    
    public static void main(String[] args) {
        
        // Primer Ejercicio
        Auto auto1 = new Auto(4, "Chevrolet", "Spin");
        auto1.mostrarInfo();
        
        // Segundo Ejercicio
        ArrayList<Figura> figuras = new ArrayList();
        
        Circulo circulo1 = new Circulo(12, "Circulo 1");
        Circulo circulo2 = new Circulo(7, "Circulo 2");
        Rectangulo rectangulo1 = new Rectangulo(8.0, 6.0, "Rectangulo 1");
        Rectangulo rectangulo2 = new Rectangulo(3.0, 5.0, "Rectangulo 2");
        
        figuras.add(circulo1);
        figuras.add(circulo2);
        figuras.add(rectangulo1);
        figuras.add(rectangulo2);
        
        for (Figura figura : figuras) {
            figura.calcularArea();
        }

        // Tercer Ejercicio
        ArrayList<Empleado> empleados = new ArrayList();
        
        EmpleadoPlanta empp1 = new EmpleadoPlanta("Roberto", 1234);
        EmpleadoPlanta empp2 = new EmpleadoPlanta("Carlos", 3456);
        EmpleadoTemporal empt1 = new EmpleadoTemporal("Pedro", 5678);
        EmpleadoTemporal empt2 = new EmpleadoTemporal("Carlos", 6789);
        
        empleados.add(empp1);
        empleados.add(empp2);
        empleados.add(empt1);
        empleados.add(empt2);
        
        for (Empleado empleado : empleados) {
            empleado.CalcularSueldo(empleado);
        }
        
        // Cuarto Ejercicio
        ArrayList<Animal> animales = new ArrayList();
        
        Gato gato = new Gato();
        Perro perro = new Perro();
        Vaca vaca = new Vaca();
        
        animales.add(gato);
        animales.add(perro);
        animales.add(vaca);
        
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
        
    }

}
