package com.perscholas.java_basics;

public class AddIntAndDouble {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 2.5;
        double sum = add(num1, num2);
        System.out.println(sum);
    }
    public static double add(int num1, double num2) {
        return num1 + num2;
    }
}
