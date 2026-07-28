/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel2;

/**
 *
 * @author yeimy
 */
public class PrincipalCuenta {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();

        cuenta.depositar(1000);
        cuenta.retirar(250);
        cuenta.mostrarSaldo();

    }

}
