/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel1;

/**
 *
 * @author yeimy
 */
public class Ejercicio18_DivisionSegura {

    public static int dividir(int a, int b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }

        return a / b;
    }

    public static void main(String[] args) {

        try {

            int resultado = dividir(20, 4);
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}
