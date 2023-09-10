/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.ElementalFunctions;

/**
 *
 * @author Leonardo Amaris
 * Contiene las funciones booleanas elementales de la calculadora.
 * Operadores booleanos:
 *  negation
 *  booleanProduct(boolean a, boolean b)
 *  booleanAddition
 *  booleanAnd
 *  booleanOr
 *  conditionalOperation
 */
public class BooleanFunctions {
    public BooleanFunctions(){}
    public static boolean negation(boolean a){
        return !a;
    };
    public static boolean booleanAnd(boolean a, boolean b){
        return a & b;
    };
    public static boolean booleanOr(boolean a, boolean b){
        return a | b;
    };
    public static boolean booleanProduct(boolean a, boolean b){
        return a && b;
    };
    public static boolean booleanAddition(boolean a, boolean b){
        return a || b;
    };
    public static boolean exclusiveAddition(boolean a, boolean b){ //-J
        return a ^ b;
    }
}
