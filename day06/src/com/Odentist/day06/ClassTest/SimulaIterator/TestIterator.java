package com.Odentist.day06.ClassTest.SimulaIterator;

import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("13");
        list.add("14");
        list.add("15");
        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            System.out.print(next+" ");
//
//        }
        while (iterator.hasNext()){
            if ("13".equals(iterator.next())) {
                iterator.remove();
                System.out.println("true");
            }
        }
    }
}
