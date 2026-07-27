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
public class Ejercicio05_UsoFinally {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

            System.out.print("Ingrese un número: ");
            int numero = teclado.nextInt();

            System.out.println("Número ingresado: " + numero);

        } catch (Exception e) {

            System.out.println("Ocurrió un error al ingresar el dato.");

        } finally {

            System.out.println("Programa finalizado. Gracias por utilizar la aplicación.");
            teclado.close();

        }

    }
}
