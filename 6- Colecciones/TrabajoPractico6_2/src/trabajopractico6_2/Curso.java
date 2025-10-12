

package trabajopractico6_2;


public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if (this.profesor == profesor){
            System.out.println("El profesor ingresado es el mismo que esta asignado al curso ");
            return;
        }
        if (this.profesor != null){
            this.profesor.eliminarCurso(this);
        }
        
        this.profesor = profesor;
        
        if(profesor != null && !profesor.getCursos().contains(this)){
            profesor.agregarCurso(this);
        }        
    }
    
    public void mostrarInfo(){
        System.out.println("Codigo: " + codigo +"\n" +
                           "Nombre: " + nombre);
        if (this.profesor != null){
            System.out.println("Profesor: " + this.profesor.getNombre());
        }else {
            System.out.println("No tiene profesor asignado");
        }
    }
    

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
}
