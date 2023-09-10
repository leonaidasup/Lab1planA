/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.ElementalEspecialFunctions.ElementalFuncionts;

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
    public boolean negation(boolean a){
        return !a;
    };
    public boolean booleanAnd(boolean a, boolean b){
        return a && b;
    };
    public boolean booleanOr(boolean a, boolean b){
        return a || b;
    };
    public boolean booleanProduct(boolean a, boolean b){
        return booleanAnd(a, b);
    };
    public boolean booleanAddition(boolean a, boolean b){
        return booleanOr(a, b);
    };
    public boolean exclusiveAddition(boolean a, boolean b){ //-J
        return a^b;
    }
}
