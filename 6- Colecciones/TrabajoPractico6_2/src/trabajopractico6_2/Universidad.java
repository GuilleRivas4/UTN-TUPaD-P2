

package trabajopractico6_2;

import java.util.ArrayList;
import java.util.List;


public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }    
    
    public void agregarProfesor (Profesor profesor){
        if (profesor != null){
            profesores.add(profesor);
        }
    }
    
    public void agregarCurso (Curso curso){
        if (curso != null){
            cursos.add(curso);
        }
    }
    
    public Curso buscarCursoPorCodigo(String codigoCurso) {
        Curso cursoEncontrado = null;
        int i = 0;
        while (i < cursos.size() && !this.cursos.get(i).getCodigo().equalsIgnoreCase(codigoCurso)) {
            i++;
        }
        if (i < cursos.size()) {
            cursoEncontrado = this.cursos.get(i);
        }
        return cursoEncontrado;
}
    
    public Profesor buscarProfesorPorId(String idProfesor) {
        Profesor profesorEncontrado = null;
        int i = 0;
        while (i < this.profesores.size() && !this.profesores.get(i).getId().equalsIgnoreCase(idProfesor)) {
            i++;
        }
        if (i < cursos.size()) {
            profesorEncontrado = this.profesores.get(i);
        }
        return profesorEncontrado;
        
}
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Curso cursoEncontrado = buscarCursoPorCodigo(codigoCurso);
        Profesor profesorEncontrado = buscarProfesorPorId(idProfesor);
        
        if (cursoEncontrado == null){
            System.out.println("El curso ingresado no fue encontrado");
            return;
        }
        if (profesorEncontrado == null){
            System.out.println("El profesor ingresado no fue encontrado");
            return;
        }
        
        cursoEncontrado.setProfesor(profesorEncontrado);        
    }
    
    public void listarProfesores(){
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }        
    }
    
    public void listarCursos(){
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }        
    }
    
    public void eliminarCurso(String codigoCurso){
        Curso cursoEncontrado = buscarCursoPorCodigo(codigoCurso);
        cursoEncontrado.setProfesor(null);
        this.cursos.remove(cursoEncontrado);
    }
    
    public void eliminarProfesor(String idProfesor){
        Profesor profesorEncontrado = buscarProfesorPorId(idProfesor);
        if (profesorEncontrado == null){
            System.out.println("No se encontro al profesor con ese ID");
            return;
        }
        List<Curso> cursosProfesor = new ArrayList<>(profesorEncontrado.getCursos());
        for (Curso curso : cursosProfesor) {
            curso.setProfesor(null);
        }
        profesores.remove(profesorEncontrado);
    }
    
    public void cantidadCursosPorProfesor(){
        for (Profesor profesor : profesores) {
            System.out.println("Profesor: " + profesor.getNombre() + " - " + "cantidad de cursos: " + profesor.getCursos().size());
        }
    }
    
    
}
