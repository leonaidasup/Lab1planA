/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.Interpreter.ElementalInterpreters;
import com.mycompany.calculator.back.OperationCalculator.BooleanOperator;
import com.mycompany.calculator.back.Interpreter.Exceptions.TypeError;
/**
 *
 * @author Leonardo_Amaris
 */
public class BooleanInterpreter {
    public BooleanInterpreter() {}
    public static boolean convertBoolean(String var) throws TypeError{
        if (!"true".equals(var) || !"false".equals(var)) {
            throw new TypeError("La variable " + var + " no es de tipo Booleana.");
        }
        return Boolean.parseBoolean(var);
    }
    public static Object outPut(String var1, String var2, String operator){
       try {
           return new BooleanOperator().result(convertBoolean(var1), convertBoolean(var2), operator);
       } catch (TypeError e){
           return e;
       }
    }
}
