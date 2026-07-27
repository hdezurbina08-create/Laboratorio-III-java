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
public class Ejercicio04_MensajePersonalizado {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            try {
                
                System.out.print("Ingrese un numero: ");
                int numero = Integer.parseInt(teclado.nextLine());
                
                System.out.println("numero ingresado: " + numero);
                
            } catch (NumberFormatException e) {
                
                System.out.println("Ocurrio un error. Verifique la informacion ingresada e intente nuevamente.");
                
            }


    }

}
}
