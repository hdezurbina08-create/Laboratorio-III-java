/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel1;

/**
 *
 * @author yeimy
 */

public class Ejercicio15_ExcepcionPersonalizada {

    public static void main(String[] args) {

        try {

            throw new MiExcepcion("Esta es una excepción personalizada.");

        } catch (MiExcepcion e) {

            System.out.println("Error: " + e.getMessage());

        }

    }
}