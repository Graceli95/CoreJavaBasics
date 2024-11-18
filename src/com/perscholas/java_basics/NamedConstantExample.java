package com.perscholas.java_basics;

public class NamedConstantExample {
    public static void main(String[] args) {
//        defines a constant named PI.
//The final keyword ensures the value of PI cannot be changed after it is assigned.
        final double PI = 3.14159;
        double radius = 5;
        double area = PI * radius * radius;
        System.out.println(area);
    }
}
