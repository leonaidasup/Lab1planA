/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.OperationCalculator;
import com.mycompany.calculator.back.ElementalFunctions.ArithmeticFunctions;
import com.mycompany.calculator.back.ElementalFunctions.ObjectFuntioncs;
import com.mycompany.calculator.back.Exceptions.TypeError;
/**
 *
 * @author leona
 */
public class TernaryOperator {
    public static boolean result(String a, String b, String operator) throws TypeError {
        switch (operator) {
            case "=" -> {
                return ObjectFuntioncs.equal(a, b);
            }
            case "!=" -> {
                return ObjectFuntioncs.different(a, b);
            }
            case ">" -> {
                return ArithmeticFunctions.greaterTo(convertDouble(a), convertDouble(b));
            }  
            case "<" -> {
                return ArithmeticFunctions.minusTo(convertDouble(a), convertDouble(b));
            }
            case "≥" -> {
                return ArithmeticFunctions.greaterEqualTo(convertDouble(a), convertDouble(b));
            }
            case "≤" -> {
                return ArithmeticFunctions.minusEqualTo(convertDouble(a), convertDouble(b));
            }
        }
        return false;
    }
    public static double convertDouble(String var) throws TypeError{
        try {
            return Integer.parseInt(var);
        } catch (NumberFormatException e) {
            throw new TypeError("La entrada" + var + " no es de tipo numerica.");
        }
    }
    public static Object outPut(String var1, String var2, String operator, String rTrue, String rFalse) throws TypeError{
        try {
            return result(var1, var2, operator)? rTrue : rFalse;
        } catch (TypeError e){
            throw e;
        }
    }
}
