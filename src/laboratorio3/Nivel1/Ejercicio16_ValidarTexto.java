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
public class Ejercicio16_ValidarTexto {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            try {
                
                System.out.print("Ingrese un texto: ");
                String texto = teclado.nextLine();
                
                if (texto.trim().isEmpty()) {
                    throw new Exception("El texto no puede estar vacío.");
                }
                
                System.out.println("Texto ingresado: " + texto);
                
            } catch (Exception e) {
                
                System.out.println("Error: " + e.getMessage());
                
            }

            }

   }
}
