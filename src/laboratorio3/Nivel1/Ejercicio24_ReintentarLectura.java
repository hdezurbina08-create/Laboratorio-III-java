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
public class Ejercicio24_ReintentarLectura {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            int numero = 0;
            boolean valido = false;
            
            while (!valido) {
                
                try {
                    
                    System.out.print("Ingrese un número entero: ");
                    numero = teclado.nextInt();
                    
                    valido = true;
                    
                } catch (InputMismatchException e) {
                    
                    System.out.println("Error: Debe ingresar un número válido.");
                    teclado.nextLine();
                    
                }
                
            }

            System.out.println("Número ingresado: " + numero);
        }
            
    }
}