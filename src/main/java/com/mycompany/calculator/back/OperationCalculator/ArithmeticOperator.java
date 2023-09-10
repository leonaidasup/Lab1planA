/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.OperationCalculator;

/**
 *
 * @author Leonardo_Amaris
 *  resuelve las operaciones dadas por el interpretador.
 */
public class ArithmeticOperator {
    public ArithmeticOperator() {}
    public Object result(double var1, double var2, String operator){
        try {
            return 0;
        } catch (NumberFormatException e) {
            return "error";
        }
    }
}
