/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.OperationCalculator;
import com.mycompany.calculator.back.ElementalEspecialFunctions.ElementalFuncionts.ByteFunctions;
import com.mycompany.calculator.back.Interpreter.Exceptions.TypeError;

/**
 *
 * @author Leonardo_Amaris
 */
public class ByteOperator {
    public ByteOperator() {}
    public static int result(int var1, int var2, String operator) {
        switch (operator) {
            case "~" -> {
                return ByteFunctions.ByteChange(var1);
            }
            case "&" -> {
                return ByteFunctions.byteChangeAND(var1, var2);
            }
            case "^" -> {
                return ByteFunctions.byteChangeXOR(var1, var2);
            }
            case "|" -> {
                return ByteFunctions.byteChangeOR(var1, var2);
            }
            case "<<" -> {
                return ByteFunctions.leftByteShift(var1, var2);
            }
            case ">>" -> {
                return ByteFunctions.signPreservingRightByteShift(var1, var2);
            }
            case ">>>" -> {
                return ByteFunctions.zeroExtendedRightByteShift(var1, var2);
            }
        }   
        return 0;
    }
    public static int convertByte(String var) throws TypeError {
        try {
            return Integer.parseInt(var);
        } catch (NumberFormatException e) {
            throw new TypeError("La variable " + var + " no es de tipo Byte.");
        }
    }
    public static Object outPut(String var1, String var2, String operator){
        try {
            return result(convertByte(var1), convertByte(var2), operator);
        } catch (TypeError e){
            return e;
        }
    }
}
