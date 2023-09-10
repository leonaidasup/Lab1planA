/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.ElementalEspecialFunctions.ElementalFuncionts;

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
    public static int leftByteShift(int num, int cantidadBits){
        return num << cantidadBits;
    }
    public static int signPreservingRightByteShift(int num, int cantidadBits){
        return num >> cantidadBits;
    }
    public static int zeroExtendedRightByteShift(int num, int cantidadBits){
        return num >>> cantidadBits;
    }
    public static double byteChangeAND(byte a, byte b){
        return a & b;
    };
    public static double byteChangeXOR(byte a, byte b){
        return a ^ b;
    };
    public static double byteChangeOR(byte a, byte b){
        return a | b;
    }; 
}
