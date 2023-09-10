    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.ElementalEspecialFunctions;

/**
 *
 * @author Leonardo.amaris
 * Contiene las funciones especiales de la calculadora.
 */
public class EspecialFunctions {
    public static int odd_sum(int a) {
        return a == 0 ? 0 : 2 * a - 1 + odd_sum(a - 1);
    }
    public static void main(String[] args) {
        System.out.println(odd_sum(4));
    }
}
