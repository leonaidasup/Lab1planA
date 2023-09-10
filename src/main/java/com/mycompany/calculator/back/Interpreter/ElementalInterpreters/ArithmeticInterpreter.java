/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.Interpreter.ElementalInterpreters;
import com.mycompany.calculator.back.OperationCalculator.ArithmeticOperator;
import com.mycompany.calculator.back.Interpreter.Exceptions.DivsionZeroError;
import com.mycompany.calculator.back.Interpreter.Exceptions.TypeError;
/**
 *
 * @author Leonardo_Amaris
 */
public class ArithmeticInterpreter {
    public ArithmeticInterpreter() {}
    public static double convertDouble(String var) throws TypeError{
        try {
            return Integer.parseInt(var);
        } catch (NumberFormatException e) {
            throw new TypeError("La variable " + var + " no es de tipo numerica.");
        }
    }
    public static Object outPut(String var1, String var2, String operator){
        try {
            return new ArithmeticOperator().result(convertDouble(var1), convertDouble(var2), operator);
        } catch (TypeError | DivsionZeroError e) {
            return e;
        }
    }
}
