package com.ODentist.day08.TreeSet;

import sun.reflect.generics.tree.Tree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class IntegerCompare {
    public static void main(String[] args) {

        int[] ints = {32,11, 12, 33, 44};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        int[] int1 = {64,332,11,12,33,44};
        TreeSet<Integer> ints2 = new TreeSet<>(((o1, o2) -> o2-o1));
        //TreeSet<Integer> ints1 = new TreeSet<>((Integer::compareTo));
//        TreeSet<Integer> ints3 = new TreeSet<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });

        for (int i : int1) {
            ints2.add(i);
        }
        System.out.println(ints2);

    }

}
