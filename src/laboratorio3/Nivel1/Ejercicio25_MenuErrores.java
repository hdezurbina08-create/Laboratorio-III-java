/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author yeimy
 */
public class Ejercicio25_MenuErrores {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            int opcion = 0;
            
            do {
                
                try {
                    
                    System.out.println("\n===== MENÚ =====");
                    System.out.println("1. Saludar");
                    System.out.println("2. Mostrar fecha");
                    System.out.println("3. Salir");
                    System.out.print("Seleccione una opción: ");
                    
                    opcion = teclado.nextInt();
                    
                    switch (opcion) {
                        
                        case 1 -> System.out.println("¡Hola! Bienvenido al programa.");
                        
                        case 2 -> System.out.println("La fecha se mostrará en una versión futura.");
                        
                        case 3 -> System.out.println("Gracias por utilizar el programa.");
                        
                        default -> System.out.println("Opción no válida.");
                        
                    }
                    
                } catch (InputMismatchException e) {
                    
                    System.out.println("Error: Debe ingresar un número.");
                    teclado.nextLine();
                    
                }
                
            } while (opcion != 3);
        }
    }
}