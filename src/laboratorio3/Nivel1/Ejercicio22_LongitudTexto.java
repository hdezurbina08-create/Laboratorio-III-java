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
public class Ejercicio22_LongitudTexto {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            try {
                
                System.out.print("Ingrese un texto: ");
                String texto = teclado.nextLine();
                
                if (texto.length() < 5) {
                    throw new Exception("El texto debe tener al menos 5 caracteres.");
                }
                
                System.out.println("Texto válido.");
                
            } catch (Exception e) {
                
                System.out.println("Error: " + e.getMessage());
                
            }

            }
}
}
