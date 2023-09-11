/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.Exceptions;

/**
 *
 * @author Leonardo_Amaris
 *  Excepccion de intento de division sobre cero.
 */
public class DivsionZeroError extends Exception {
    public DivsionZeroError() {
        super("Division por cero.");
    }
}
