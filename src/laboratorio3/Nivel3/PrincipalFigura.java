/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel3;

/**
 *
 * @author yeimy
 */
public class PrincipalFigura {

    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado(5);
        Circulo circulo = new Circulo(3);

        System.out.println("Area del cuadrado: " + cuadrado.area());
        System.out.println("Area del círculo: " + circulo.area());

    }

}
