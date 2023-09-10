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
    public static int oddSum(int a, int b) {
        return a == 0 ? 0 : 2 * a - 1 + b + oddSum(a - 1, b); // a ** 2
    }
    public static int NicomacoCube(int a) {
        return oddSum(a, a * (a - 1) + 1);
    }
    public static void main(String[] args) {
        System.out.println(NicomacoCube(4));
    }
}
