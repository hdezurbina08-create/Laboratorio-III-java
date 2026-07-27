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
public class Ejercicio23_ControlEntrada {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            try {
                
                System.out.print("Ingrese un número entero: ");
                int numero = teclado.nextInt();
                
                System.out.println("Número ingresado: " + numero);
                
            } catch (InputMismatchException e) {
                
                System.out.println("Error: Debe ingresar un número entero.");
                
            }
            
            teclado.close();

            }
}
}
