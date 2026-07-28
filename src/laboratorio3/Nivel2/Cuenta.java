/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3.Nivel2;

/**
 *
 * @author yeimy
 */

public class Cuenta {

    private double saldo;

    public void depositar(double monto) {

        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto debe ser mayor que cero.");
        }

    }

    public void retirar(double monto) {

        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes.");
        }

    }

    public void mostrarSaldo() {

        System.out.println("Saldo disponible: Q" + saldo);

    }

}