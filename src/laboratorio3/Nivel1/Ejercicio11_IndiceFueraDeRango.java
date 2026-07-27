/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel1;

/**
 *
 * @author yeimy
 */
public class Ejercicio11_IndiceFueraDeRango {

    public static void main(String[] args) {

        int[] numeros = {10,50,90,80};

        try {

            System.out.println("Número: " + numeros[10]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: El índice está fuera del rango del arreglo.");

        }

    }

}
