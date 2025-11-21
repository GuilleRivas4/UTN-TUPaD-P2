
package trabajopractico8ManejadorErrores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TrabajoPractico8ManejadorExcepciones {
    
    private static Scanner scanner = new Scanner(System.in);

    // 1. División segura
    public static void divisionSegura() {
        System.out.println("\n--- 1. División Segura ---");
        try {
            System.out.print("Introduce el dividendo (numerador): ");
            int num1 = scanner.nextInt();
            System.out.print("Introduce el divisor (denominador): ");
            int num2 = scanner.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado de la división: " + resultado);

        } catch (ArithmeticException e) {
            System.err.println("ERROR: ArithmeticException. No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.err.println("ERROR: InputMismatchException. Debes introducir números enteros.");
            scanner.next();
        }
    }

    // 2. Conversión de cadena a número
    public static void conversionSegura() {
        System.out.println("\n--- 2. Conversión de Cadena a Número ---");
        System.out.print("Introduce un texto para convertir a número entero: ");
        String texto = scanner.next(); 

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Conversión exitosa. Número: " + numero);
        } catch (NumberFormatException e) {
            System.err.println("ERROR: NumberFormatException. La cadena introducida no es un número entero válido.");
        }
    }

    // 3. y 5. Lectura de archivo (Combinando con try-with-resources)
    public static void lecturaArchivo(String nombreArchivo) {
        System.out.println("\n--- 3. y 5. Lectura de Archivo (Usando try-with-resources) ---");

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            System.out.println("Archivo '" + nombreArchivo + "' encontrado. Contenido:");
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println("> " + linea);
            }
        } catch (java.io.FileNotFoundException e) {
            System.err.println("ERROR: FileNotFoundException. El archivo '" + nombreArchivo + "' no fue encontrado.");
        } catch (IOException e) {
            System.err.println("ERROR: IOException. Ocurrió un error de lectura/escritura: " + e.getMessage());
        }
    }

    // 4. Excepción personalizada
    public static void validarEdad() {       
        System.out.println("\n--- 4. Excepción Personalizada ---");
        int edad = 0;
        try {
            System.out.print("Introduce tu edad: ");
            edad = scanner.nextInt();
            
            if (edad < 0) {
                throw new EdadInvalidaException("La edad no puede ser negativa.");
            } else if (edad > 120) {
                throw new EdadInvalidaException("La edad máxima permitida es 120.");
            } else {
                System.out.println("Edad válida: " + edad + " años.");
            }
        } catch (InputMismatchException e) {
            System.err.println("ERROR de Entrada: Debes introducir un número entero para la edad.");
            scanner.next(); 
        }catch (EdadInvalidaException e) {
            System.err.println("ERROR de Edad: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        divisionSegura(); 

        conversionSegura();

        validarEdad();

        lecturaArchivo("prueba.txt");
        lecturaArchivo("archivo_inexistente.dat");

        scanner.close();
    }

}
