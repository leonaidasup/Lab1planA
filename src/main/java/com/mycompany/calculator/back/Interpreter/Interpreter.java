/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.Interpreter;
import com.mycompany.calculator.back.OperationCalculator.*;

/**
 *
 * @author Leonardo.amaris
 *  Interpreta la decisiones tomadas por el usuario.
 */
public class Interpreter {
    private String var1;
    private String var2;
    private String operator;
    private Object operatorTipe;
    public Interpreter(String var1, String var2, String operator, String operatorTipe) {
        this.var1 = var1;
        this.var2 = var2;
        this.operator = operator;
        this.operatorTipe = operatorTipe;
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
        this.operatorTipe = operatorTipe;
    }
    public double convertDouble(String var) {
        return Double.parseDouble(var);
    }
    public boolean convertBoolean(String var) {
        return Boolean.parseBoolean(var);
    }
    public byte convertByte(String var) {
        return Byte.parseByte(var);
    }
    public Object outPut(){
       if (this.operatorTipe instanceof Double) {
           return new ArithmeticOperator(convertDouble(var1), convertDouble(var2), operator).result();
       }
       else if (this.operatorTipe instanceof Boolean) {
           return new BooleanOperator(convertBoolean(var1), convertBoolean(var2), operator).result();
       }
       else {
           return new ByteOperator(convertByte(var1), convertByte(var2), operator).result();
       }
    }
}
