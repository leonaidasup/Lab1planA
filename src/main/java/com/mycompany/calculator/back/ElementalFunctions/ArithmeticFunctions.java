/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.ElementalFunctions;
/**
 *
 * @author Leonardo_Amaris arrietajh
 * Contiene las aritmeticas funciones elementales de la calculadora.
 * Operadores aritmeticos:
 *  addition
 *  subtraction
 *  multiplication
 *  division
 *  rest
 *  minusEqualTo
 *  graterEqualTo
 *  backwardUnitIncrement
 *  forwartUnitIncrement
 */
public class ArithmeticFunctions {
    public ArithmeticFunctions(){}
    public static double addition(double a, double b){ // Leonardo
        return a + b;
    };
    public static double subtraction(double a, double b){ // Leonardo
        return a - b;
    };
    public static double multiplication(double a, double b){ // Leonardo
        return a * b;
    };
    public static double division(double a, double b){ // Leonardo
        return a / b;
    };
    public static double rest(double a, double b){ // Leonardo
        return a % b;
    };
    public static boolean minusEqualTo(double a, double b){ // Leonardo
        return a <= b;
    };
    public static boolean greaterIgualQue(double a, double b){ // Leonardo
        return a >= b;
    };
    public static double backwardUnitIncrement(double a){ // Leonardo
        return a ++;
    };
    public static double forwardUnitIncrement(double a){ // Leonardo
        return a --;
    };
}
