package trabajopractico3;


public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }    

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion >= 0) { 
            this.añoPublicacion = añoPublicacion;
        }else {
            System.out.println("Valor ingresado Invalido");
        }
    }
    
    
    
    
}