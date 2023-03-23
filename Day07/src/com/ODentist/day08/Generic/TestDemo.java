package com.ODentist.day08.Generic;

public class TestDemo {
    public static void main(String[] args) {
        GenericTest<String> a=new GenericTest<>("ha ha");
        GenericTest<String> s = new GenericTest<>();
        s.setA("haha");
        System.out.println(a.getA());
        System.out.println(s.getA());

    }


}
