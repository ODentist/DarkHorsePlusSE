package com.ODentist.day08.HomeWork;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1123");
        arrayList.add("1123");
        arrayList.add(111);
        arrayList.forEach(s->{
            String s1 = (String) s;
            System.out.println(s1.length());
        });
    }
}
