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
public class Ejercicio12_MultiplesExcepciones {
   public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            try {
                
                System.out.print("Ingrese un número: ");
                int numero = teclado.nextInt();
                
                int resultado = 100 / numero;
                
                System.out.println("Resultado: " + resultado);
                
            } catch (InputMismatchException e) {
                
                System.out.println("Error: Debe ingresar un número entero.");
                
            } catch (ArithmeticException e) {
                
                System.out.println("Error: No se puede dividir entre cero.");
                
            }


    }

}
}