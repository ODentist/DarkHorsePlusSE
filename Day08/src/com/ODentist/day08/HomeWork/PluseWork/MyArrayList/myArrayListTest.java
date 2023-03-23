package com.ODentist.day08.HomeWork.PluseWork.MyArrayList;

public class myArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> integerMyArrayList = new MyArrayList<>();
        integerMyArrayList.add(1);
        integerMyArrayList.add(22);
        integerMyArrayList.add(333);
        integerMyArrayList.get(1);
        integerMyArrayList.remove(1);
        integerMyArrayList.set(1,21);
        System.out.println(integerMyArrayList.get(0));
        System.out.println(integerMyArrayList.get(1));
        System.out.println(integerMyArrayList.get(2));
    }
}
