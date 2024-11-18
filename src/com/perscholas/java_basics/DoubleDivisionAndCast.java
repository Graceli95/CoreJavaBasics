package com.perscholas.java_basics;

public class DoubleDivisionAndCast {
    public static void main(String[] args) {
       double num1 = 3.14;
       double num2 = 1.5;
       double result = num1 / num2;
       System.out.println(result);
//       cast the double to an integer, (int) is the explicit cast operator.
//       Casting from double to int does not round the value; it simply removes the fractional part.
       int intVariable = (int) result;
       System.out.println(intVariable);
    }
}
