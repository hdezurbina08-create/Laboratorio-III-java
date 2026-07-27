/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel1;

/**
 *
 * @author yeimy
 */
public class Ejercicio08_ManejarExcepcionMetodo {

    public static void dividir(int a, int b) {

        try {

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error: No se puede dividir entre cero.");

        }

    }

    public static void main(String[] args) {

        dividir(20, 6);

    }
}
