/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.Interpreter.ElementalInterpreters;
import com.mycompany.calculator.back.OperationCalculator.ByteOperator;
import com.mycompany.calculator.back.Interpreter.Exceptions.TypeError;
/**
 *
 * @author Leonardo_Amaris
 */
public class ByteInterpreter {
    public ByteInterpreter() {}
    public byte convertByte(String var) throws TypeError {
        if (!"1".equals(var) || !"0".equals(var)){
            throw new TypeError("La variable " + var + " no es de tipo Byte.");
        }
        return Byte.parseByte(var);
    }
    public Object outPut(String var1, String var2, String operator){
        try {
            return new ByteOperator(convertByte(var1), convertByte(var2), operator).result();
        } catch (TypeError e){
            return "error";
        }
    }
}