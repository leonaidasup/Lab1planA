/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.Interpreter.ElementalInterpreters;
import com.mycompany.calculator.back.Interpreter.Exceptions.TypeError;
import com.mycompany.calculator.back.OperationCalculator.ByteOperator;
/**
 *
 * @author Leonardo_Amaris
 */
public class ByteInterpreter {
    public ByteInterpreter() {}
    public static int convertByte(String var) throws TypeError {
        try {
            return Integer.parseInt(var);
        } catch (NumberFormatException e) {
            throw new TypeError("La variable " + var + " no es de tipo Byte.");
        }
    }
    public static Object outPut(String var1, String var2, String operator){
        try {
            return ByteOperator.result(convertByte(var1), convertByte(var2), operator);
        } catch (TypeError e){
            return e;
        }
    }
}