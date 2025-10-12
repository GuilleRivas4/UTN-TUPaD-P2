
package trabajopractico6_2;

public class TrabajoPractico6_2 {

    
    public static void main(String[] args) {
        //Creo la universidad
        Universidad utn = new Universidad("UTN");
        
        //Creo los 3 profesores
        Profesor profe1 = new Profesor("100", "Roberto", "Programación");
        Profesor profe2 = new Profesor("101", "Carlos", "Matemática");
        Profesor profe3 = new Profesor("102", "Juan", "Sistemas Operativos");
        
        //Creo 5 cursos
        Curso progra1 = new Curso("1", "Programación 1");
        Curso progra2 = new Curso("2", "Programación 2");
        Curso mate1 = new Curso("3", "Matemática 1");
        Curso mate2 = new Curso("4", "Matemática 2");
        Curso os = new Curso("5", "Sistemas Operativos");
        
        //Agrego profesores a la universidad
        utn.agregarProfesor(profe1);
        utn.agregarProfesor(profe2);
        utn.agregarProfesor(profe3);
        //Agrego cursos a la universidad
        utn.agregarCurso(progra1);
        utn.agregarCurso(progra2);
        utn.agregarCurso(mate1);
        utn.agregarCurso(mate2);
        utn.agregarCurso(os);
        
        //Asigno profesores a cursos
        utn.asignarProfesorACurso("1", "100");
        utn.asignarProfesorACurso("2", "100");
        utn.asignarProfesorACurso("3", "101");
        utn.asignarProfesorACurso("4", "101");
        utn.asignarProfesorACurso("5", "102");
        
        //Listo cursos con su profesor y profesores con sus cursos
        System.out.println("********Cursos********");
        utn.listarCursos();
        System.out.println("************************");
        System.out.println("********Profesores********");
        utn.listarProfesores();
        System.out.println("************************");
        
        //Cambio de profesor de un curso
        System.out.println("********Cambio de profesor********");
        utn.asignarProfesorACurso("5", "100");
        System.out.println("********Cursos********");
        utn.listarCursos();
        System.out.println("************************");
        System.out.println("********Profesores********");
        utn.listarProfesores();
        
        //Removiendo un curso 
        System.out.println("********Removiendo un curso ********");
        utn.eliminarCurso("5");
        System.out.println("********Cursos********");
        utn.listarCursos();
        System.out.println("************************");
        System.out.println("********Profesores********");
        utn.listarProfesores();
        
        //Removiendo un profesor 
        System.out.println("********Removiendo un profesor ********");
        utn.eliminarProfesor("101");
        System.out.println("********Cursos********");
        utn.listarCursos();
        System.out.println("************************");
        System.out.println("********Profesores********");
        utn.listarProfesores();
        
        //Reporte de cantidad de cursos por profesor
        System.out.println("********Cantidad de cursos por profesor********");
        utn.cantidadCursosPorProfesor();
        
    }

}
