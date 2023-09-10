/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.ElementalFunctions;

/**
 *
 * @author arrietajh
 * Contiene las funciones de bytes elementales de la calculadora.
 * Operadores en bytes:
 *  byteChange
 *  lefByteShift
 *  signPreservingRightByteShift
 *  zeroExtendedRightByteShift
 *  byteChangeAND
 *  byteChangeXOR
 *  byteChangeOR
 */
public class ByteFunctions {
    public ByteFunctions(){}
    public static int ByteChange(int a){
        return ~a;
    }
    public static int byteChangeAND(int a, int b){
        return a & b;
    };
    public static int byteChangeXOR(int a, int b){
        return a ^ b;
    };
    public static int byteChangeOR(int a, int b){
        return a | b;
    }; 
    public static int leftByteShift(int a, int b){
        return a << b;
    }
    public static int signPreservingRightByteShift(int a, int b){
        return a >> b;
    }
    public static int zeroExtendedRightByteShift(int a, int b){
        return a >>> b;
    }
}
