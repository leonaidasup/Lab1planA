/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.ElementalEspecialFunctions.ElementalFuncionts;

/**
 *
 * @author Leonardo_Amaris
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
    public double addition(double a, double b){
        return a + b;
    };
    public double subtraction(double a, double b){
        return a - b;
    };
    public double multiplication(double a, double b){
        return a * b;
    };
    public double division(double a, double b){
        return a / b;
    };
    public double rest(double a, double b){
        return a - (int) division(a, b);
    };
    public boolean minusEqualTo(double a, double b){
        return a <= b;
    };
    public boolean greaterIgualQue(double a, double b){
        return a >= b;
    };
    public double backwardUnitIncrement(double a){
        return a ++;
    };
    public double forwardUnitIncrement(double a){
        return a --;
    };
    public double unitSum(double a){ //-J
        return +a;
    }
    public double unitSubtraction(double a){ //-J
        return -a;
    }
}
