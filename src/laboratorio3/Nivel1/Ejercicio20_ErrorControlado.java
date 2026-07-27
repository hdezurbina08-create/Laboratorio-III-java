/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel1;

/**
 *
 * @author yeimy
 */
public class Ejercicio20_ErrorControlado {

    public static void main(String[] args) {

        try {

            throw new Exception("Se produjo un error controlado.");

        } catch (Exception e) {

            System.out.println("Mensaje: " + e.getMessage());

        }

    }

}
