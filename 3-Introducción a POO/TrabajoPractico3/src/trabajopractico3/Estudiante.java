
package trabajopractico3;


public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " Apellido: " + apellido 
                + " Curso: " + curso + " Calificación: " + calificacion);
    }
    
    public void subirCalificacion(int puntos){
        if (puntos >= 0){
            calificacion += puntos;
        } 
    }
    
    public void bajarCalificacion(int puntos){
        if (puntos >= 0){
            calificacion -= puntos;
        } 
    }
}
