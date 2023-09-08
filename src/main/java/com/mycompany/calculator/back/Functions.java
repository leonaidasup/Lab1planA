/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back;

/**
 *
 * @author leona
 */
public class Functions implements Operations{
    // Aritmetics operations
    public double addition(double a, double b){
        return a + b;
    };
    public double subtraction(double a, double b){
        return a - b;
    };
    public double multiplication(double a, double b){
        return a * b;
    };
    public double division(double a, double b){
        return a / b;
    };
    public double rest(double a, double b){
        return a - (int)division(a, b) * b;
    };
    public boolean minusEqualTo(double a, double b){
        return a <= b;
    };
    public boolean greaterIgualQue(double a, double b){
        return a >= b;
    };
    public double backwardUnitIncrement(double a){
        return a + 1;
    };
    public double forwardUnitIncrement(double a, double b){
        return a - 1;
    };
}
