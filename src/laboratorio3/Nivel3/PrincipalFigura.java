/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel3;

import java.util.ArrayList;
/**
 *
 * @author yeimy
 */
public class PrincipalFigura {

     public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Cuadrado(5));
        figuras.add(new Circulo(3));
        figuras.add(new Cuadrado(8));
        figuras.add(new Circulo(6));

        for (Figura figura : figuras) {

            System.out.println("Figura: " + figura.getClass().getSimpleName());
            System.out.println("Area: " + figura.area());
            System.out.println("------------------------");

        }

    }

}