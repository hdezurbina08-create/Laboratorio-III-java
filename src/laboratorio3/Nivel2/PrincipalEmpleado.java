/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel2;

/**
 *
 * @author yeimy
 */
public class PrincipalEmpleado {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Andres");
        empleado1.setSalario(4500);

        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Carlos");
        empleado2.setSalario(5200);

        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Maria");
        empleado3.setSalario(6100);

        empleado1.mostrarDatos();
        System.out.println("-----------------------");
        empleado2.mostrarDatos();
        System.out.println("-----------------------");
        empleado3.mostrarDatos();

    }

}
