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
    public int scrollingBitleft(int num, int cantidadBits){
        return num << cantidadBits;
    }
    public int scrollingBitRight(int num, int cantidadBits){
        return num >> cantidadBits;
    }
    public int scrollingBitRightWithCero(int num, int cantidadBits){
        return num >> cantidadBits;
    }
    public double leftByteShift(byte a, byte b){
        return 0;
    };
    public double signPreservingRightByteShift(byte a, byte b){
        return 0;
    };
    public double zeroExtendedRightByteShift(byte a, byte b){
        return 0;
    };
    public double byteChangeAND(byte a, byte b){
        return 0;
    };
    public double byteChangeXOR(byte a, byte b){
        return 0;
    };
    public double byteChangeOR(byte a, byte b){
        return 0;
    };
    public int BitChange(int a){
        return ~a;
    }
}
