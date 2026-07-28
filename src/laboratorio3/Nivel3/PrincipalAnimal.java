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
public class PrincipalAnimal {
    
    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro());
        animales.add(new Gato());
        
         for (Animal animal : animales) {

            animal.sonido();

        }

    }
    
}
