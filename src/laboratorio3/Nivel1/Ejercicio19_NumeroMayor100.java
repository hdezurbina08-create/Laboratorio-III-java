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
public class Ejercicio19_NumeroMayor100 {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            try {
                
                System.out.print("Ingrese un número: ");
                int numero = teclado.nextInt();
                
                if (numero <= 100) {
                    throw new Exception("El número debe ser mayor que 100.");
                }
                
                System.out.println("Número válido.");
                
            } catch (Exception e) {
                
                System.out.println("Error: " + e.getMessage());
                
            }

            }
}
}
