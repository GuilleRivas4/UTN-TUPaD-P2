
package trabajopractico4;

public class TrabajoPractico4 {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Roberto", "Desarrollador");
        Empleado empleado2 = new Empleado(15, "Roberto", "Desarrollador", 500);
        
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        
        empleado1.actualizarSalario(40.0);
        empleado2.actualizarSalario(300);
        
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        
        Empleado.mostrarTotalEmpleados();
        
        
    }

}
