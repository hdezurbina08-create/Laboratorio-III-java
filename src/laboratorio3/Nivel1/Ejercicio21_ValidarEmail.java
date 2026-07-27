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
public class Ejercicio21_ValidarEmail {

    public static boolean validarEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese un correo electrónico: ");
            String email = teclado.nextLine();
            
            if (validarEmail(email)) {
                System.out.println("Correo electrónico válido.");
            } else {
                System.out.println("Correo electrónico no válido.");
            }
        }
    }
}
