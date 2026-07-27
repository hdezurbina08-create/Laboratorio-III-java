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
public class Ejercicio10_ValidarContrasena {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            try {
                
                System.out.print("Ingrese una contraseña: ");
                String contrasena = teclado.nextLine();
                
                if (contrasena.length() < 8) {
                    throw new Exception("La contraseña debe tener al menos 8 caracteres.");
                }
                
                System.out.println("Contraseña válida.");
                
            } catch (Exception e) {
                
                System.out.println("Error: " + e.getMessage());
                
            }

            }
}
}
