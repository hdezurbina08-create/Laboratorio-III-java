/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel1;

/**
 *
 * @author yeimy
 */
public class Ejercicio17_CharAt {

    public static void main(String[] args) {

        String palabra = "java";

        try {

            System.out.println("Carácter: " + palabra.charAt(10));

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Error: La posición indicada no existe.");

        }

    }

}
