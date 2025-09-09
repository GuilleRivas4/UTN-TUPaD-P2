

package trabajopractico4;


public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    private static int contadorId = 0;
    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        
        Empleado.totalEmpleados++;
        
    }

    public Empleado(String nombre, String puesto) {
        this.id = ++contadorId;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000;
        //Resolver id automatico
        
        Empleado.totalEmpleados++;        
    }
    
    public void actualizarSalario(double porcentaje){
        if (porcentaje > 0) {
            this.salario += this.salario * (porcentaje/100);
        }else {
            System.out.println("El porcentaje ingresado es invalido");
        }
    }
    
    public void actualizarSalario(int cantidad){
        if (cantidad > 0) {
            this.salario += cantidad;
        }else {
            System.out.println("La cantidad ingresada es invalida");
        }
    }
    
    public static void mostrarTotalEmpleados(){
        System.out.println("Cantidad actual de empleados: " + Empleado.totalEmpleados);
    }

    @Override
    public String toString() {
        return "Empleado[" + "id: " + id + ", nombre: " + nombre + ", puesto: " + puesto + ", salario: " + salario + ']';
    }

    
    // Se crean solo los Getters ya que el ID no debe ser modificable
    // El nombre y puesto ya se setean en los constructores
    // Hay dos metodos para actualizar el salario
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }
    
    
    

    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
}
