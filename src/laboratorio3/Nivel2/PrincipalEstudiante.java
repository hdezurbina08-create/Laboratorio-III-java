/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel2;

/**
 *
 * @author yeimy
 */
public class PrincipalEstudiante {
    
    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante();
        
        estudiante.setNombre("Maria");
        estudiante.setNota1(80);
        estudiante.setNota2(95);
        estudiante.setNota3(75);
        
        estudiante.mostrarResultado();
    }
    
}
