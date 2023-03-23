package com.ODentist.Thread.ProductionAndConsumption;

public class Test {
    public static void main(String[] args) {
        Foodie foodie = new Foodie();
        Cook cook = new Cook();
        foodie.start();
        cook.start();
    }
}
