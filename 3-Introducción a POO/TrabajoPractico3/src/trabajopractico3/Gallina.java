

package trabajopractico3;


public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void envejecer(){
        System.out.println("La gallina " + idGallina +" cumplio años!");
        edad += 1;
        System.out.println("Ahora tiene " + edad + "!");
    }
    
    public void ponerHuevo(int cantidad){
        if (cantidad > 0) {
            System.out.println("La gallina " + idGallina +" puso " + cantidad +" huevo!");
            huevosPuestos += cantidad;
            System.out.println("Ya puso " + huevosPuestos + " huevos!");
        }
    }
    
    public void mostrarEstado(){
        System.out.println("La gallina " + idGallina + " tiene " + edad + " años y puso " 
        + huevosPuestos + " huevos!");
    }
    
}
