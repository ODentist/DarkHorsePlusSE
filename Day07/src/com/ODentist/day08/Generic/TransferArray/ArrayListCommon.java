package com.ODentist.day08.Generic.TransferArray;

import java.util.ArrayList;

public class ArrayListCommon {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Object> l3 = new ArrayList<>();
        ArrayList<Number> l4 = new ArrayList<>();
method1(l3);
method2(l4);
method3(l4);



    }
    public static  void method1(ArrayList<?> list){}
    public static  void method2(ArrayList<? super Integer> list){}
    public static  void method3(ArrayList<? extends Number> list){}
}
