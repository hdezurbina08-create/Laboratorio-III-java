/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel1;

/**
 *
 * @author yeimy
 */
public class Ejercicio03_ConvertirTextoNumero {
    
    public static void main(String[]args) {
        
        String texto = "HOla";
        
        try {
            int numero = Integer.parseInt(texto);

            System.out.println("Número: " + numero);

        } catch (NumberFormatException e) {

            System.out.println("Error: El texto no puede convertirse a un número.");

        }

    }

}