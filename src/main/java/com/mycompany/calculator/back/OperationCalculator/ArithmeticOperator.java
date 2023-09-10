/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.OperationCalculator;
import com.mycompany.calculator.back.ElementalEspecialFunctions.ElementalFuncionts.ArithmeticFunctions;
import com.mycompany.calculator.back.Interpreter.Exceptions.DivsionZeroError;
/**
 *
 * @author Leonardo_Amaris
 *  resuelve las operaciones dadas por el interpretador.
 */
public class ArithmeticOperator {
    public ArithmeticOperator() {}
    public Object result(double var1, double var2, String operator) throws DivsionZeroError{
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
                    return new DivsionZeroError();
                }
                return ArithmeticFunctions.division(var1, var2);
            }
            case "%" -> {
                if (var2 == 0) {
                    return new DivsionZeroError();
                }
                return ArithmeticFunctions.rest(var1, var2);
            }
            case "<=" -> {
                return ArithmeticFunctions.minusEqualTo(var1, var2);
            }
            case ">=" -> {
                return ArithmeticFunctions.greaterIgualQue(var1, var2);
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
}
