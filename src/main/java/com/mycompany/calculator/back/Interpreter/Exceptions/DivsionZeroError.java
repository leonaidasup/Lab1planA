/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.Interpreter.Exceptions;

/**
 *
 * @author leona
 */
public class DivsionZeroError extends Exception {
    public DivsionZeroError() {
        super("Division por cero.");
    }
}
