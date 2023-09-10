/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.Interpreter.Exceptions;

/**
 *
 * @author Leonardo_Amaris
 *  Exceccion para entregar error de tipo, es decir, convertir una variable String 
 *  en el tipo correspondiente a las operaciones a ejecutar.
 */
public class TypeError extends Exception {
    public TypeError(String msj) {
        super(msj);
    }
}
