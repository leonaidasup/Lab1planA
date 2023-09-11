/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.OperationCalculator;
import com.mycompany.calculator.back.ElementalFunctions.ArithmeticFunctions;
import com.mycompany.calculator.back.Exceptions.DivsionZeroError;
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
public class ArithmeticOperator {
    public ArithmeticOperator() {}
    public static Object result(double var1, double var2, String operator) throws DivsionZeroError{
        switch (operator) {
            case "+" -> {
                return ArithmeticFunctions.addition(var1, var2);
            }
            case "-" -> {
                return ArithmeticFunctions.subtraction(var1, var2);
            }
            case "*" -> {
                return ArithmeticFunctions.multiplication(var1, var2);
            }
            case "/" -> {
                if (var2 == 0) {
                    throw new DivsionZeroError();
                }
                return ArithmeticFunctions.division(var1, var2);
            }
            case "%" -> {
                if (var2 == 0) {
                    throw new DivsionZeroError();
                }
                return ArithmeticFunctions.rest(var1, var2);
            }
            case "<=" -> {
                return ArithmeticFunctions.minusEqualTo(var1, var2);
            }
            case "<" -> {
                return ArithmeticFunctions.minusTo(var1, var2);
            }
            case ">=" -> {
                return ArithmeticFunctions.greaterEqualTo(var1, var2);
            }
            case ">" -> {
                return ArithmeticFunctions.greaterTo(var1, var2);
            }
            case "++" -> {
                return ArithmeticFunctions.backwardUnitIncrement(var1);
            }
            case "--" -> {
                return ArithmeticFunctions.forwardUnitIncrement(var1);
            }
        } 
        return null;
    }
    public static double convertDouble(String var) throws TypeError{
        try {
            return Integer.parseInt(var);
        } catch (NumberFormatException e) {
            throw new TypeError("La entrada" + var + " no es de tipo numerica.");
        }
    }
    public static Object outPut(String var1, String var2, String operator) throws TypeError, DivsionZeroError{
        try {
            return result(convertDouble(var1), convertDouble(var2), operator);
        } catch (TypeError | DivsionZeroError e) {
            throw e;
        }
    }
}
