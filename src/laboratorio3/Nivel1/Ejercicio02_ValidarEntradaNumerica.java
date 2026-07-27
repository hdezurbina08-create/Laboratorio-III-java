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
public class Ejercicio02_ValidarEntradaNumerica {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            try {
                
                System.out.print("Ingrese un número entero: ");
                int numero = teclado.nextInt();
                
                System.out.println("El número ingresado es: " + numero);
                
            } catch (InputMismatchException e) {
                
                System.out.println("Error: Debe ingresar únicamente números enteros.");
                
            }


    }

}
}
