package com.ODentist.Day13.HomeWork.SignleAndDoubleCount;

public class TestCount {
    public static void main(String[] args) {
        SingleCount singleCount = new SingleCount();
        DoubleCount doubleCount = new DoubleCount();
        doubleCount.setName("double");
        singleCount.setName("single");
        doubleCount.start();
        singleCount.start();
    }
}
