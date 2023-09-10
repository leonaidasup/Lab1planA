/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.Interpreter.ElementalInterpreters;
import com.mycompany.calculator.back.OperationCalculator.ArithmeticOperator;
import com.mycompany.calculator.back.Interpreter.Exceptions.DivsionZeroError;
/**
 *
 * @author Leonardo_Amaris
 */
public class ArithmeticInterpreter {
    public ArithmeticInterpreter() {}
    public static double convertDouble(String var) {
        return Double.parseDouble(var);
    }
    public static Object outPut(String var1, String var2, String operator){
        try {
            return new ArithmeticOperator().result(convertDouble(var1), convertDouble(var2), operator);
        } catch (NumberFormatException | DivsionZeroError e) {
            return "error";
        }
    }
}
