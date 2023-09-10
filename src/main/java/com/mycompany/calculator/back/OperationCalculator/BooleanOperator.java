/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.OperationCalculator;
import com.mycompany.calculator.back.ElementalFunctions.BooleanFunctions;
import com.mycompany.calculator.back.Interpreter.Exceptions.TypeError;

/**
 *
 * @author Leonardo_Amaris
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
        if (!"true".equals(var) || !"false".equals(var)) {
            throw new TypeError("La variable " + var + " no es de tipo Booleana.");
        }
        return Boolean.parseBoolean(var);
    }
    public static Object outPut(String var1, String var2, String operator){
       try {
           return result(convertBoolean(var1), convertBoolean(var2), operator);
       } catch (TypeError e){
           return e;
       }
    }
}
