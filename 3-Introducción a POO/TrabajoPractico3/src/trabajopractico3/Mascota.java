package trabajopractico3;


public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " Especie: " + especie 
                + " Edad: " + edad);
    }
    
    public void cumplirAnios(){
        System.out.println(nombre +" cumplio años!");
        edad += 1;
        System.out.println("Ahora tiene " + edad + "!");
    }
    
    

}