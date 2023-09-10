/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.ElementalFunctions;

/**
 *
 * @author Leonardo_Amaris arrietajh
 * Contiene las funciones de objetos elementales de la calculadora.
 * Operadores de object:
 *  conditionalOperation
 *  concatenation
 */
public class ObjectFuntioncs {
    public ObjectFuntioncs(){}
    public static Object conditionalOperation(boolean condicion, Object valorVerdadero, Object valorFalso){ //-J
        return condicion ? valorVerdadero : valorFalso;
    //la funcion es de tipo objeto para permitir el manejo de varios tipos de dato como resultado 
    };
    public static String concatenation(String a, String b){
        return a + b;
    };
    public static boolean equal(Object a, Object b){
        return a == b;
    };
    public static boolean different(Object a, Object b){
        return a != b;
    };
}
