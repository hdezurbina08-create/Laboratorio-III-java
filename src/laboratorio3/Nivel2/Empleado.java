/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel2;

/**
 *
 * @author yeimy
 */
public class Empleado {

    private String nombre;
    private double salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario debe ser...");
        }
    }

    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: Q" + salario);
    }
}