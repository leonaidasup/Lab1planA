/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.Interpreter;
import com.mycompany.calculator.back.Interpreter.ElementalInterpreters.*;
/**
 *
 * @author Leonardo_Amaris
 *  Interpreta la decisiones tomadas por el usuario ademas de verificar que variables
 *  y su operacion de tipo presente el mismo tipo de variable.
 */
public class Interpreter {
    private String var1;
    private String var2;
    private String operator;
    private Object operatorType;
    public Interpreter(String var1, String var2, String operator, String operatorType) {
        this.var1 = var1;
        this.var2 = var2;
        this.operator = operator;
        this.operatorType = operatorType;
    }
    public void setVar1(String var1) {
        this.var1 = var1;
    }
    public void setVar2(String var2) {
        this.var2 = var2;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
    public void setOperatorTipe(Object operatorTipe) {
        this.operatorType = operatorTipe;
    }
    public Object outPut(){
       if (this.operatorType instanceof Double) {
           return ArithmeticInterpreter.outPut(var1, var2, operator);
       } else if (this.operatorType instanceof Boolean) {
           return BooleanInterpreter.outPut(var1, var2, operator);
       } else {
           return ByteInterpreter.outPut(var1, var2, operator);
       }
    }
}
