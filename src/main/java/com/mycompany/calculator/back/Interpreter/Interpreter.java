/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.Interpreter;

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
    public Object outPut(String order, String OperatorTipe){
        return 0;
    }
    
}
