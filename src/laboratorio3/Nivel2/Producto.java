/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel2;

/**
 *
 * @author yeimy
 */
public class Producto {

    private String nombre;
    private double precio;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        
        if(precio > 0){
            this.precio = precio;
        }else {
            System.out.println("El precio debe ser mayor que cero.");
        }
           }
    public void mostrarproducto(){
        
        System.out.println("producto:" + nombre);
        System.out.println("Precio: Q" + precio);
    }

    void mostrarProducto() {
        System.out.println("Nombre: " + this.nombre);
    System.out.println("Precio: " + this.precio);
    }
}