/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package back;

/**
 *
 * @author leona
 */
public interface Operations {
    // Aritmetics operations
    public double addition(double a, double b);
    public double subtraction(double a, double b);
    public double multiplication(double a, double b);
    public double divsion(double a, double b);
    public double rest(double a, double b);
    public boolean minusEqualTo(double a, double b);
    public boolean greaterIgualQue(double a, double b);
    public double backwardUnitIncrement(double a, double b);
    public double forwardUnitIncremen(double a, double b);
    // Byte operations
    public double byteChange(byte a, byte b);
    public double leftByteShift(byte a, byte b);
    public double signPreservingRightByteShift(byte a, byte b);
    public double zeroExtendedRightByteShift(byte a, byte b);
    public double byteChangeAND(byte a, byte b);
    public double byteChangeXOR(byte a, byte b);
    public double byteChangeOR(byte a, byte b);
    // Boolean operations
    public boolean negation(boolean a, boolean b);
    public boolean booleanProduct(boolean a, boolean b);
    public boolean booleanAddition(boolean a, boolean b);
    public boolean booleanAnd(boolean a, boolean b);
    public boolean booleanOr(boolean a, boolean b);
    public boolean conditionalOperation(boolean a, boolean b);
    // Cadena operations
    public int[] concatenation(int[] a, int[] b);
    public short[] concatenation(short[] a, short[] b);
    public double[] concatenation(double[] a, double[] b);
    public float[] concatenation(float[] a, float[] b);
    public boolean[] concatenation(boolean[] a, boolean[] b);
    public byte[] concatenation(byte[] a, byte[] b);
    public char[] concatenation(char[] a, char[] b);
    // Objets operations
    // Primitive operations
    public boolean equal(int a, int b);
    public boolean equal(short a, short b);
    public boolean equal(double a, double b);
    public boolean equal(float a, float b);
    public boolean equal(boolean a, boolean b);
    public boolean equal(byte a, byte b);
    public boolean equal(char a, char b);
    public boolean different(int a, int b);
    public boolean different(short a, short b);
    public boolean different(double a, double b);
    public boolean different(float a, float b);
    public boolean different(boolean a, boolean b);
    public boolean different(byte a, byte b);
    public boolean different(char a, char b);
}
