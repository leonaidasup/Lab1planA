/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.OperationCalculator;
import com.mycompany.calculator.back.ElementalFunctions.BooleanFunctions;
import com.mycompany.calculator.back.Exceptions.TypeError;

/**
 *
 * @author Leonardo_Amaris
 *  Resuelve las operaciones dadas por el interpretador para el tipo de variable.
 * 
 *  - result
 *  - convertDouble
 *  - outPut
 */
public class BooleanOperator {
    public BooleanOperator() {}
    public static boolean result(boolean var1, boolean var2, String operator) {
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
    public static boolean convertBoolean(String var) throws TypeError{
        System.out.println(var);
        if (!("true".equals(var) || "false".equals(var))) {
            throw new TypeError("La entrada " + var + " no es de tipo Booleana.");
        }
        return "true".equals(var);
    }
    public static Object outPut(String var1, String var2, String operator) throws TypeError{
       return result(convertBoolean(var1), convertBoolean(var2), operator);
    }
}
