/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.calculator.back;

/**
 *
 * @author leona
 */
public interface Operations {
    // Aritmetics operations
    double addition(double a, double b);
    double subtraction(double a, double b);
    double multiplication(double a, double b);
    double divsion(double a, double b);
    double rest(double a, double b);
    boolean minusEqualTo(double a, double b);
    boolean greaterIgualQue(double a, double b);
    double backwardUnitIncrement(double a, double b);
    double forwardUnitIncremen(double a, double b);
    // Byte operations
    double byteChange(byte a, byte b);
    double leftByteShift(byte a, byte b);
    double signPreservingRightByteShift(byte a, byte b);
    double zeroExtendedRightByteShift(byte a, byte b);
    double byteChangeAND(byte a, byte b);
    double byteChangeXOR(byte a, byte b);
    double byteChangeOR(byte a, byte b);
    // Boolean operations
    boolean negation(boolean a, boolean b);
    boolean booleanProduct(boolean a, boolean b);
    boolean booleanAddition(boolean a, boolean b);
    boolean booleanAnd(boolean a, boolean b);
    boolean booleanOr(boolean a, boolean b);
    boolean conditionalOperation(boolean a, boolean b);
    // Cadena operations
    int[] concatenation(int[] a, int[] b);
    short[] concatenation(short[] a, short[] b);
    double[] concatenation(double[] a, double[] b);
    float[] concatenation(float[] a, float[] b);
    boolean[] concatenation(boolean[] a, boolean[] b);
    byte[] concatenation(byte[] a, byte[] b);
    char[] concatenation(char[] a, char[] b);
    // Objets operations
    // Primitive operations
    boolean equal(int a, int b);
    boolean equal(short a, short b);
    boolean equal(double a, double b);
    boolean equal(float a, float b);
    boolean equal(boolean a, boolean b);
    boolean equal(byte a, byte b);
    boolean equal(char a, char b);
    boolean different(int a, int b);
    boolean different(short a, short b);
    boolean different(double a, double b);
    boolean different(float a, float b);
    boolean different(boolean a, boolean b);
    boolean different(byte a, byte b);
    boolean different(char a, char b);
}
