/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.Interpreter.ElementalInterpreters;
import com.mycompany.calculator.back.OperationCalculator.ByteOperator;
/**
 *
 * @author Leonardo_Amaris
 */
public class ByteInterpreter {
    public ByteInterpreter() {}
    public static int convertByte(String var) {
        return Integer.parseInt(var);
    }
    public static Object outPut(String var1, String var2, String operator){
        try {
            return ByteOperator.result(convertByte(var1), convertByte(var2), operator);
        } catch (NumberFormatException e){
            return "error";
        }
    }
}