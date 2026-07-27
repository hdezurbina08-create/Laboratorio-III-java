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
public class Ejercicio06_ValidarNumeroPositivo {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            try {
                
                System.out.print("Ingrese un número positivo: ");
                int numero = teclado.nextInt();
                
                if (numero < 0) {
                    throw new Exception("El número no puede ser negativo.");
                }
                
                System.out.println("Número válido: " + numero);
                
            } catch (Exception e) {
                
                System.out.println("Error: " + e.getMessage());
                
            }

            }
}
}