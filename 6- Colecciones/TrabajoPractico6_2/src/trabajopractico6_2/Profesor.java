

package trabajopractico6_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(Curso curso){
        if (curso != null && !this.cursos.contains(curso)){
            this.cursos.add(curso);
            if (curso.getProfesor() != this){
                curso.setProfesor(this);
            }
        }
    }
    
    public void eliminarCurso(Curso curso){
        if (curso != null && this.cursos.contains(curso)){
            this.cursos.remove(curso);
            if (curso.getProfesor() == this){
                curso.setProfesor(null);
            }
        }
    }
    
    private void listarCursos(){
        for (Curso curso : cursos){
            System.out.println("Codigo: " + curso.getCodigo() + " Nombre: " + curso.getNombre());
        }
    }
    
    public void mostrarInfo(){
        System.out.println("ID: " + this.id +"\n" +
                           "Nombre: " + this.nombre +"\n" +
                           "Especialidad: " + this.especialidad +"\n" +
                           "Cantidad de cursos: " + cursos.size());
        listarCursos();
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
    
    
    
}
