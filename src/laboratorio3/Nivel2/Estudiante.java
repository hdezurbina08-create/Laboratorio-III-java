/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel2;

/**
 *
 * @author yeimy
 */
public class Estudiante {

    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota1(double nota1) {

    if (nota1 >= 0 && nota1 <= 100) {
        this.nota1 = nota1;
    } else {
        System.out.println("La nota 1 debe estar entre 0 y 100.");
    }

}

public void setNota2(double nota2) {

    if (nota2 >= 0 && nota2 <= 100) {
        this.nota2 = nota2;
    } else {
        System.out.println("La nota 2 debe estar entre 0 y 100.");
    }

}

public void setNota3(double nota3) {

    if (nota3 >= 0 && nota3 <= 100) {
        this.nota3 = nota3;
    } else {
        System.out.println("La nota 3 debe estar entre 0 y 100.");
    }

}
    
    public double calcularPromedio() {

    return (nota1 + nota2 + nota3) / 3;

}
    public void mostrarResultado() {

    System.out.println("Estudiante: " + nombre);
    System.out.println("Promedio: " + calcularPromedio());

}

}
