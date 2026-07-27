/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel1;

/**
 *
 * @author yeimy
 */
public class Ejercicio07_MetodoNumeroNegativo {

    public static void validarNumero(int numero) throws Exception {

        if (numero < 0) {
            throw new Exception("El número es negativo.");
        }

        System.out.println("Número válido.");
    }

    public static void main(String[] args) {

        try {

            validarNumero(-8);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }
}
