/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel1;

/**
 *
 * @author yeimy
 */
public class Ejercicio13_ThrowManual {

    public static void main(String[] args) {

        try {

            throw new Exception("Me gusta jugar basquetbol.");

        } catch (Exception e) {

            System.out.println("Mensaje: " + e.getMessage());

        }

    }

}
