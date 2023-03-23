package com.ODentist.day08.Generic;

public class GenericTest <A>{
    private A a;

    public GenericTest(A a) {
        this.a = a;
    }

    public GenericTest() {
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
