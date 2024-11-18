package com.perscholas.java_basics;

public class CafeOrder {
    public static void main(String[] args) {
//         Declare variables for product prices
        double coffeePrice = 3.5;
        double cappuccinoPrice = 2.5;
        double greenTeaPrice = 4.5;
//        Quantities ordered
        int coffeeQty = 2;
        int greenTeaQty = 4;
        int cappuccinoQty = 3;
//        Calculate subtotal
        double subTotal = (coffeeQty * coffeePrice) + (greenTeaQty * greenTeaPrice) + (cappuccinoQty * cappuccinoPrice);
//  Declare a constant for sales tax
        final double Sales_Tax = 0.08;
        // Calculate total sale including sales tax
        double totalSale = subTotal + (subTotal * Sales_Tax);
        System.out.println(totalSale);
        System.out.println(subTotal);
    }
}
