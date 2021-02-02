package oop.msic.math;

import java.lang.Math;

public class JavaMathExample1 {
    public static void main(String[] args) {
        double a,b;
        a = 39.25;
        b = 4.25;
        // return the maximum of two numbers
        System.out.println(Math.max(a,b));

        // return the minimum of two numbers
        System.out.println(Math.min(a,b));

        // return the square root of y
        System.out.println("Square root of y is: " + Math.sqrt(a));

        // return the power
        System.out.println(Math.pow(a,b));

        // return the logarithm of given value
        System.out.println(Math.log(a));
        System.out.println(Math.log(b));

        // return the log of x + 1
        System.out.println("log1p of x is: " +Math.log1p(a));

        // return a power of 2
        System.out.println("exp of a is: " +Math.exp(b));

        // return (a power of 2)-1
        System.out.println("expm1 of a is: " +Math.expm1(a));


    }
}
