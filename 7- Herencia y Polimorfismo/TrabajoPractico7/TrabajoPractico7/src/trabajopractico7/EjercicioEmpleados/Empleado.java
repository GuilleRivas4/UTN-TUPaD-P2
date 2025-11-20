

package trabajopractico7.EjercicioEmpleados;


public abstract class Empleado {
    protected String nombre;
    protected int legajo;
    protected double sueldo;

    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public void setsueldo(double sueldo) {
        this.sueldo = sueldo;
    }   
    
    
    public void CalcularSueldo(Empleado empleado){
        if (empleado instanceof EmpleadoPlanta){
            this.setsueldo(2000000);
            System.out.println(this + " Sueldo: " + sueldo);
        }else if (empleado instanceof EmpleadoTemporal){
            this.setsueldo(1400000);
            System.out.println(this + " Sueldo: " + sueldo);
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Legajo: " + legajo;
    }
    
    
    
}
