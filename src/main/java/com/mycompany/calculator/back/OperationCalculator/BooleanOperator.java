/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.OperationCalculator;
import com.mycompany.calculator.back.ElementalEspecialFunctions.ElementalFuncionts.BooleanFunctions;

/**
 *
 * @author Leonardo_Amaris
 */
public class BooleanOperator {
    public BooleanOperator() {}
    public boolean result(boolean var1, boolean var2, String operator) {
        switch (operator) {
            case "!" -> {
                return BooleanFunctions.negation(var1);
            }
            case "|" -> {
                return BooleanFunctions.booleanOr(var1, var2);
            }
            case "^" -> {
                return BooleanFunctions.exclusiveAddition(var1, var2);
            }
            case "&" -> {
                return BooleanFunctions.booleanAnd(var1, var2);
            }
            case "||" -> {
                return BooleanFunctions.booleanAddition(var1, var2);
            }
            case "&&" -> {
                return BooleanFunctions.booleanProduct(var1, var2);
            }    
        }
        return false;
    }
}
