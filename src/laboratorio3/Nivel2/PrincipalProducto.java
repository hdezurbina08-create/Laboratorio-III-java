/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel2;

import java.util.ArrayList;
/**
 *
 * @author yeimy
 */
public class PrincipalProducto {
    
    public static void main (String[] args) {
        
        ArrayList<Producto> productos = new ArrayList<>();
        
        Producto producto1 = new Producto();
        producto1.setNombre("Laptop");
        producto1.setPrecio(5000);
        
        Producto producto2 = new Producto();
        producto2.setNombre("Mouse");
        producto2.setPrecio(125);
        
         Producto producto3 = new Producto();
        producto3.setNombre("Teclado");
        producto3.setPrecio(250);
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        
        for (Producto producto : productos) {
             producto.mostrarProducto();
            System.out.println("-----------------");
        }
        
    }
    
}
