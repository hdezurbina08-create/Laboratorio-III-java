/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel1;

import java.util.Scanner;

/**
 *
 * @author yeimy
 */

public class Ejercicio01_DivisionEntreCero {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            try {
                
                System.out.print("Ingrese el primer número: ");
                int numero1 = teclado.nextInt();
                
                System.out.print("Ingrese el segundo número: ");
                int numero2 = teclado.nextInt();
                
                int resultado = numero1 / numero2;
                
                System.out.println("El resultado es: " + resultado);
                
            } catch (ArithmeticException e) {
                
                System.out.println("Error: No se puede dividir entre cero.");
                
            }


    }
    }
}

