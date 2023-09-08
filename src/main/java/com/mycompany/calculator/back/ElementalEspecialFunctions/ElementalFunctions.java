/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.back.ElementalEspecialFunctions;
/**
 *
 * @author Leonardo Amaris
 * Contiene las funciones elementales de la calculadora.
 * Operadores aritmeticos:
 *  addition
 *  subtraction
 *  multiplication
 *  division
 *  rest
 *  minusEqualTo
 *  graterEqualTo
 *  backwardUnitIncrement
 *  forwartUnitIncrement
 * 
 * Operadores en bytes:
 *  byteChange
 *  lefByteShift
 *  signPreservingRightByteShift
 *  zeroExtendedRightByteShift
 *  byteChangeAND
 *  byteChangeXOR
 *  byteChangeOR
 * 
 * Operadores booleanos:
 *  negation
 *  booleanProduct(boolean a, boolean b)
 *  booleanAddition
 *  booleanAnd
 *  booleanOr
 *  conditionalOperation
 * 
 * Operadores de cadena:
 *  concatenation
 * 
 * Operadores primitivos
 *  equal
 *  different
 */
public class ElementalFunctions {
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
        return a - (int) division(a, b);
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
    public double forwardUnitIncrement(double a){
        return a - 1;
    };
    // Byte operations
    public double byteChange(double a){
        return 0;
    };
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
    // Boolean operations
    public boolean negation(boolean a){
        return !a;
    };
    public boolean booleanAnd(boolean a, boolean b){
        return a && b;
    };
    public boolean booleanOr(boolean a, boolean b){
        return a || b;
    };
    public boolean booleanProduct(boolean a, boolean b){
        return booleanAnd(a, b);
    };
    public boolean booleanAddition(boolean a, boolean b){
        return booleanOr(a, b);
    };
    public boolean conditionalOperation(boolean a, boolean b){
        return false; // falta trabajar
    };
    // Cadena operations
    public int concatenation(int a, int b){
        return 0;
    };
    public short concatenation(short[] a, short[] b){
        return 0;
    };
    public double concatenation(double[] a, double[] b){
        return 0;
    };
    public float concatenation(float[] a, float[] b){
        return 0;
    };
    public boolean concatenation(boolean[] a, boolean[] b){
        return false;
    };
    public byte concatenation(byte[] a, byte[] b){
        return 0;
    };
    public char concatenation(char[] a, char[] b){
        return '0';
    };
    // Objets operations
    // Primitive operations
    public boolean equal(int a, int b){
        return a == b;
    };
    public boolean equal(short a, short b){
        return a == b;
    };
    public boolean equal(double a, double b){
        return a == b;
    };
    public boolean equal(float a, float b){
        return a == b;
    };
    public boolean equal(boolean a, boolean b){
        return a == b;
    };
    public boolean equal(byte a, byte b){
        return a == b;
    };
    public boolean equal(char a, char b){
        return a == b;
    };
    public boolean different(int a, int b){
        return a != b;
    };
    public boolean different(short a, short b){
        return a != b;
    };
    public boolean different(double a, double b){
        return a != b;
    };
    public boolean different(float a, float b){
        return a != b;
    };
    public boolean different(boolean a, boolean b){
        return a != b;
    };
    public boolean different(byte a, byte b){
        return a != b;
    };
    public boolean different(char a, char b){
        return a != b;
    };
    // Especial functions
}

