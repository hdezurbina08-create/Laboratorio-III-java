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
public class Ejercicio09_ValidarEdad {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

            System.out.print("Ingrese su edad: ");
            int edad = teclado.nextInt();

            if (edad < 0) {
                throw new Exception("La edad no puede ser negativa.");
            }

            System.out.println("Edad registrada: " + edad);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        teclado.close();
    }
}
